package org.sword.log;

/**
 * A Generic Logging Interface
 */
public interface Log {

    public void v(final String tag, final String message, final Throwable throwable);

    public void v(final String tag, final String message);


    public void d(final String tag, final String message, final Throwable throwable);

    public void d(final String tag, final String message);


    public void i(final String tag, final String message, final Throwable throwable);

    public void i(final String tag, final String message);


    public void e(final String tag, final String message, final Throwable throwable);

    public void e(final String tag, final String message);


    public void w(final String tag, final String message, final Throwable throwable);

    public void w(final String tag, final String message);


    public void wtf(final String tag, final String message, final Throwable throwable);

    public void wtf(final String tag, final String message);

}
