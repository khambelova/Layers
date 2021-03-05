package tech.itpark.jdbc;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public class JDBCTemplate {
    public <T> List<T> query(ResultSet rs, RowMapper<T> mapper){

        //TODO:
        throw new UnsupportedOperationException("Not imlemented");
    }

    public <T> Optional<T> querySingle(ResultSet rs, RowMapper<T> mapper) {
        Optional.ofNullable(query(rs,mapper));
        throw new UnsupportedOperationException("Not imlemented");
    }
    }
