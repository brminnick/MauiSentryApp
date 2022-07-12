package crc64d42650af502c5fe4;


public class BeforeSendCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.sentry.SentryOptions.BeforeSendCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_execute:(Lio/sentry/SentryEvent;Lio/sentry/Hint;)Lio/sentry/SentryEvent;:GetExecute_Lio_sentry_SentryEvent_Lio_sentry_Hint_Handler:Sentry.Java.SentryOptions/IBeforeSendCallbackInvoker, Sentry\n" +
			"";
		mono.android.Runtime.register ("Sentry.Android.Callbacks.BeforeSendCallback, Sentry", BeforeSendCallback.class, __md_methods);
	}


	public BeforeSendCallback ()
	{
		super ();
		if (getClass () == BeforeSendCallback.class)
			mono.android.TypeManager.Activate ("Sentry.Android.Callbacks.BeforeSendCallback, Sentry", "", this, new java.lang.Object[] {  });
	}


	public io.sentry.SentryEvent execute (io.sentry.SentryEvent p0, io.sentry.Hint p1)
	{
		return n_execute (p0, p1);
	}

	private native io.sentry.SentryEvent n_execute (io.sentry.SentryEvent p0, io.sentry.Hint p1);

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
