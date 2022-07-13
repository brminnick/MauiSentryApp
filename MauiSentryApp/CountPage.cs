using System;
using System.Threading.Tasks;
using CommunityToolkit.Maui.Markup;
using Sentry;
using Sentry.Extensibility;

namespace MauiSentryApp
{
    public class CountPage : ContentPage
    {
        readonly Stepper _stepper;
        readonly Label _countLabel;
        readonly ISentryClient _sentryClient;

        public CountPage(ISentryClient sentryClient)
        {
            _sentryClient = sentryClient;

            Content = new VerticalStackLayout
            {
                Spacing = 20,

                Children =
                {
                    new Label().Text("0").TextCenter().Assign(out _countLabel),

                    new Stepper
                    {
                        Minimum = double.MinValue,
                        Increment = 1,
                        Value = 0,
                    }.Center().Assign(out _stepper)
                     .Invoke(stepper => stepper.ValueChanged += HandleStepperValueChanged),

                    new Label().Text("Crank it up to eleven\n...or drop it below zero", Colors.DimGray).TextCenter()
                }
            }.Center();
        }

        async void HandleStepperValueChanged(object? sender, ValueChangedEventArgs e)
        {
            if (e.NewValue < 0)
            {
                await PromptForCrash();
            }
            else if (e.NewValue > 10)
            {
                await GetFeedback();
            }
            else
            {
                var breadcrumbEvent = new SentryEvent { TransactionName = "Stepper Value Changed" };

                if (e.NewValue > e.OldValue)
                    breadcrumbEvent.AddBreadcrumb("Increment", data:new Dictionary<string, string> { { "New Value", e.NewValue.ToString() } });
                else if (e.NewValue < e.OldValue)
                    breadcrumbEvent.AddBreadcrumb("Decrement", data: new Dictionary<string, string> { { "New Value", e.NewValue.ToString() } });

                _sentryClient.CaptureEvent(breadcrumbEvent);

                _countLabel.Text = e.NewValue.ToString();
            }
        }

        async Task PromptForCrash()
        {
            try
            {
                throw new ArgumentOutOfRangeException("Picker value cannot be negative");
            }
            catch (Exception ex)
            {
                var shouldCrashApp = await DisplayAlert("Crash App?", "Tapping OK will crash the app", "OK", "Cancel");

                _sentryClient.CaptureException(ex);

                if (shouldCrashApp)
                    throw;
            }
            finally
            {
                _stepper.Value = 0;
            }
        }

        async Task GetFeedback()
        {
            try
            {
                var eventId = SentrySdk.CaptureMessage("Picker Value Exceeded 10");

                var isEnjoying = await DisplayAlert("Enjoying the app?", "Are you enjoying the app?", "Yes", "No");

                if (isEnjoying)
                    _sentryClient.CaptureUserFeedback(new UserFeedback(eventId, "Brandon Minnick", "brandon@codetraveler.io", "Great app!"));
                else
                    _sentryClient.CaptureUserFeedback(new UserFeedback(eventId, "Brandon Minnick", "brandon@codetraveler.io", "Meh"));
            }
            finally
            {
                _stepper.Value = 10;
            }
        }
    }
}
