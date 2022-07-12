package crc64d6ffa46988e9e3ab;


public class JavaLogger
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.sentry.ILogger
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_isEnabled:(Lio/sentry/SentryLevel;)Z:GetIsEnabled_Lio_sentry_SentryLevel_Handler:Sentry.Java.ILoggerInvoker, Sentry\n" +
			"n_log:(Lio/sentry/SentryLevel;Ljava/lang/String;[Ljava/lang/Object;)V:GetLog_Lio_sentry_SentryLevel_Ljava_lang_String_arrayLjava_lang_Object_Handler:Sentry.Java.ILoggerInvoker, Sentry\n" +
			"n_log:(Lio/sentry/SentryLevel;Ljava/lang/String;Ljava/lang/Throwable;)V:GetLog_Lio_sentry_SentryLevel_Ljava_lang_String_Ljava_lang_Throwable_Handler:Sentry.Java.ILoggerInvoker, Sentry\n" +
			"n_log:(Lio/sentry/SentryLevel;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V:GetLog_Lio_sentry_SentryLevel_Ljava_lang_Throwable_Ljava_lang_String_arrayLjava_lang_Object_Handler:Sentry.Java.ILoggerInvoker, Sentry\n" +
			"";
		mono.android.Runtime.register ("Sentry.Android.JavaLogger, Sentry", JavaLogger.class, __md_methods);
	}


	public JavaLogger ()
	{
		super ();
		if (getClass () == JavaLogger.class)
			mono.android.TypeManager.Activate ("Sentry.Android.JavaLogger, Sentry", "", this, new java.lang.Object[] {  });
	}


	public boolean isEnabled (io.sentry.SentryLevel p0)
	{
		return n_isEnabled (p0);
	}

	private native boolean n_isEnabled (io.sentry.SentryLevel p0);


	public void log (io.sentry.SentryLevel p0, java.lang.String p1, java.lang.Object[] p2)
	{
		n_log (p0, p1, p2);
	}

	private native void n_log (io.sentry.SentryLevel p0, java.lang.String p1, java.lang.Object[] p2);


	public void log (io.sentry.SentryLevel p0, java.lang.String p1, java.lang.Throwable p2)
	{
		n_log (p0, p1, p2);
	}

	private native void n_log (io.sentry.SentryLevel p0, java.lang.String p1, java.lang.Throwable p2);


	public void log (io.sentry.SentryLevel p0, java.lang.Throwable p1, java.lang.String p2, java.lang.Object[] p3)
	{
		n_log (p0, p1, p2, p3);
	}

	private native void n_log (io.sentry.SentryLevel p0, java.lang.Throwable p1, java.lang.String p2, java.lang.Object[] p3);

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
