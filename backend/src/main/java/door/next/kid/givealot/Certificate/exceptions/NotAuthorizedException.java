package door.next.kid.givealot.Certificate.exceptions;

public class NotAuthorizedException extends CertificateException {
    public NotAuthorizedException(){}
    public NotAuthorizedException(String message){super(message);}
    public NotAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

}
