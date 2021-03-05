package tech.itpark.exception;


public class PasswordInvalidException extends AppException {
  public PasswordInvalidException() {
  }

  public PasswordInvalidException(String message) {
    super(message);
  }

  public PasswordInvalidException(String message, Throwable cause) {
    super(message, cause);
  }

  public PasswordInvalidException(Throwable cause) {
    super(cause);
  }

  public PasswordInvalidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
