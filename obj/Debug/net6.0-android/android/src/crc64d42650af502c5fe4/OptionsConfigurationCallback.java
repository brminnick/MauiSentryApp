package crc64d42650af502c5fe4;


public class OptionsConfigurationCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.sentry.Sentry.OptionsConfiguration
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_configure:(Lio/sentry/SentryOptions;)V:GetConfigure_Lio_sentry_SentryOptions_Handler:Sentry.Java.Sentry/IOptionsConfigurationInvoker, Sentry\n" +
			"";
		mono.android.Runtime.register ("Sentry.Android.Callbacks.OptionsConfigurationCallback, Sentry", OptionsConfigurationCallback.class, __md_methods);
	}


	public OptionsConfigurationCallback ()
	{
		super ();
		if (getClass () == OptionsConfigurationCallback.class)
			mono.android.TypeManager.Activate ("Sentry.Android.Callbacks.OptionsConfigurationCallback, Sentry", "", this, new java.lang.Object[] {  });
	}


	public void configure (io.sentry.SentryOptions p0)
	{
		n_configure (p0);
	}

	private native void n_configure (io.sentry.SentryOptions p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
