package tech.itpark.model;

// Data Class (Immutable) -> Record
public class ResetModel extends Model {
  private final String newPassword;
  private final String secret; // имя любимого животного

  public ResetModel(String login, String newPassword, String secret) {
    super(login);
    this.newPassword = newPassword;
    this.secret = secret;
  }

  public String getNewPassword() {
    return newPassword;
  }

  public String getSecret() {
    return secret;
  }
}
