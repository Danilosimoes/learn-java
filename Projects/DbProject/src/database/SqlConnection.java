package database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnection {

    public static Connection getSql()  {
        try {
            Properties prop = getProperties();
            final String url = prop.getProperty("db.url");
            final String user = prop.getProperty("db.user");
            final String password = prop.getProperty("db.password");

            return DriverManager.getConnection(url, user, password);

        }  catch (SQLException | IOException e){
            throw new RuntimeException(e);
        }



    }
    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String cnt = "/connection.properties";
        prop.load(SqlConnection.class.getResourceAsStream(cnt));
        return prop;
    }
}
