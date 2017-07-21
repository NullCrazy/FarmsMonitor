package cn.linghaiweiye.data.exception;

/**
 * Description :
 * <p/>
 * Created by Chris Kyle on 2016/6/14.
 */
public final class NetworkException extends Exception {

    public NetworkException() {
        super();
    }

    public NetworkException(final String message) {
        super(message);
    }

    public NetworkException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NetworkException(final Throwable cause) {
        super(cause);
    }
}
