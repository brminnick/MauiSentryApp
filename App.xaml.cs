namespace MauiSentryApp;

public partial class App : Application
{
	public App(CountPage countPage)
	{
		InitializeComponent();

		MainPage = new AppShell(countPage);
	}
}

