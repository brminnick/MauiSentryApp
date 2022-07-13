using CommunityToolkit.Maui.Markup;
using Sentry;

namespace MauiSentryApp;

public static class MauiProgram
{
	public static MauiApp CreateMauiApp()
	{
		var builder = MauiApp
						.CreateBuilder()
						.UseMauiApp<App>()
						.UseMauiCommunityToolkitMarkup()
						.ConfigureFonts(fonts =>
						{
							fonts.AddFont("OpenSans-Regular.ttf", "OpenSansRegular");
							fonts.AddFont("OpenSans-Semibold.ttf", "OpenSansSemibold");
						})
						.UseSentry(options =>
						{
							options.Dsn = "https://4e21564ab4374deb8b95da8a25dc2cca@o166840.ingest.sentry.io/6568237";
							options.Debug = true;
							options.TracesSampleRate = 1.0;
							options.StackTraceMode = StackTraceMode.Enhanced;
							options.Release = AppInfo.VersionString;
						});

		builder.Services.AddTransient<CountPage>();

		return builder.Build();
	}
}

