package database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnection {

    public static Connection getSql()  {
        try {
            final String url = "*";
            final String user = "*";
            final String password = "*";

            return DriverManager.getConnection(url, user, password);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
