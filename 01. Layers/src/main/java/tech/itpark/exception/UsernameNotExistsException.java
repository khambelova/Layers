package tech.itpark.exception;


public class UsernameNotExistsException extends AppException {
  public UsernameNotExistsException() {

  }

  public UsernameNotExistsException(String message) {
    super(message);
  }

  public UsernameNotExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public UsernameNotExistsException(Throwable cause) {
    super(cause);
  }

  public UsernameNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
