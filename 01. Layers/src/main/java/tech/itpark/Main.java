package tech.itpark;

import tech.itpark.emulation.Singleton;
import tech.itpark.entity.UserEntity;
import tech.itpark.repository.UserRepository;
import tech.itpark.repository.UserRepositoryJDBCImpl;
import tech.itpark.service.UserService;
import tech.itpark.service.UserServiceDefaultImpl;

import java.sql.*;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Singleton.getInstance();

    String dsn = "jdbc:postgresql://localhost:5400/appdb?user=app&password=pass";

    try (Connection connection = DriverManager.getConnection(dsn);){
      UserRepository repository = new UserRepositoryJDBCImpl(connection);
      UserService service = new UserServiceDefaultImpl(repository);
      List<UserEntity> users = repository.findAll();
      System.out.println(users.get(0).getCreated());


//      Statement statement = connection.createStatement();
//
//      ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//
//      while (resultSet.next())
//      {
//        System.out.println(resultSet.getString("login"));
//      }
    }

    //TODO: work with service
    catch (SQLException e)
    {
      e.printStackTrace();
    }

  }
}
