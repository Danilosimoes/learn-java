package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlAccess {
    public static void main(String[] args) throws SQLException {

        Connection connection = SqlConnection.getSql();
        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS CARS");

        connection.close();

    }
}


