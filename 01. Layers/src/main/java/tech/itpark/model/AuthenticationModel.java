package tech.itpark.model;

// Data Class (Immutable) -> Record
public class  AuthenticationModel extends Model {
  private final String password;

  public AuthenticationModel(String login, String password) {
    super(login);
    this.password = password;
  }

  public String getPassword() {
    return password;
  }
}
