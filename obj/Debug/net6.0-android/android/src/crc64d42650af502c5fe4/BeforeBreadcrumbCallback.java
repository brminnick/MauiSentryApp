package crc64d42650af502c5fe4;


public class BeforeBreadcrumbCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.sentry.SentryOptions.BeforeBreadcrumbCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_execute:(Lio/sentry/Breadcrumb;Lio/sentry/Hint;)Lio/sentry/Breadcrumb;:GetExecute_Lio_sentry_Breadcrumb_Lio_sentry_Hint_Handler:Sentry.Java.SentryOptions/IBeforeBreadcrumbCallbackInvoker, Sentry\n" +
			"";
		mono.android.Runtime.register ("Sentry.Android.Callbacks.BeforeBreadcrumbCallback, Sentry", BeforeBreadcrumbCallback.class, __md_methods);
	}


	public BeforeBreadcrumbCallback ()
	{
		super ();
		if (getClass () == BeforeBreadcrumbCallback.class)
			mono.android.TypeManager.Activate ("Sentry.Android.Callbacks.BeforeBreadcrumbCallback, Sentry", "", this, new java.lang.Object[] {  });
	}


	public io.sentry.Breadcrumb execute (io.sentry.Breadcrumb p0, io.sentry.Hint p1)
	{
		return n_execute (p0, p1);
	}

	private native io.sentry.Breadcrumb n_execute (io.sentry.Breadcrumb p0, io.sentry.Hint p1);

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
