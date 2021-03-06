package tech.itpark.model;

// Data Class (Immutable) -> Record
public class RemovalModel extends Model{
  private final String password;

  public RemovalModel(String login, String password) {
    super(login);
    this.password = password;
  }

  public String getPassword() {
    return password;
  }
}
