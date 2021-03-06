package tech.itpark.model;

// Data Class (Immutable) -> Record
public class RegistrationModel extends Model {
  private final String password;
  private final String name;
  private final String secret;

  public RegistrationModel(String login, String password, String name, String secret) {
    super(login);
    this.password = password;
    this.name = name;
    this.secret = secret;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  public String getSecret() {
    return secret;
  }
}
