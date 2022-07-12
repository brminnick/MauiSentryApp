package crc64d42650af502c5fe4;


public class TracesSamplerCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.sentry.SentryOptions.TracesSamplerCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_sample:(Lio/sentry/SamplingContext;)Ljava/lang/Double;:GetSample_Lio_sentry_SamplingContext_Handler:Sentry.Java.SentryOptions/ITracesSamplerCallbackInvoker, Sentry\n" +
			"";
		mono.android.Runtime.register ("Sentry.Android.Callbacks.TracesSamplerCallback, Sentry", TracesSamplerCallback.class, __md_methods);
	}


	public TracesSamplerCallback ()
	{
		super ();
		if (getClass () == TracesSamplerCallback.class)
			mono.android.TypeManager.Activate ("Sentry.Android.Callbacks.TracesSamplerCallback, Sentry", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Double sample (io.sentry.SamplingContext p0)
	{
		return n_sample (p0);
	}

	private native java.lang.Double n_sample (io.sentry.SamplingContext p0);

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
