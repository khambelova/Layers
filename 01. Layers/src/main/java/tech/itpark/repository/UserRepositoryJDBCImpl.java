package tech.itpark.repository;

import tech.itpark.entity.UserEntity;
import tech.itpark.exception.DataAccessException;
import tech.itpark.jdbc.RowMapper;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class UserRepositoryJDBCImpl implements UserRepository{

    private final Connection connection;
    private final RowMapper<UserEntity> mapper = rs -> {
        try {
            return new UserEntity(
                    rs.getLong("id"),
                    rs.getString("login"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("secret"),
                    Set.of((String[])rs.getArray("roles").getArray()),
                    rs.getBoolean("removed"),
                    rs.getLong("created")
                );
        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    };

    public UserRepositoryJDBCImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<UserEntity> findAll() {
        try (
                Statement statement = connection.createStatement();
                final ResultSet rs = statement.executeQuery("SELECT id,login,password ,name,secret,roles,EXTRACT (EPOCH FROM created) created,removed FROM users ORDER BY id");)
        {
            List<UserEntity> result = new LinkedList<>();
                while (rs.next()){
                    final UserEntity entity = mapper.map(rs);
                    result.add(entity);
                }
            return result;
        }
        catch (SQLException e)
        {

        }
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public UserEntity save(UserEntity entity) {
        return null;
    }

    @Override
    public boolean removeById(Long aLong) {
        return false;
    }

    @Override
    public boolean existsByLogin(String login) {
        return false;
    }

    @Override
    public Optional<UserEntity> findByLogin(String login) {
        return Optional.empty();
    }
}
