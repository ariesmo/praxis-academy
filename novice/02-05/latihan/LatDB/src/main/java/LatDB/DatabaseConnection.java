package LatDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
        // initialize all the information
        // Database Connection
        // String dbDriver = "com.mariadb.jdbc.Driver";
        String dbUrl = "jdbc:mariadb://localhost/";

        // Database name to access
        String dbName = "AMROOD";
        String dbUsername = "root";
        String dbPassword = "";

        // Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbUrl + dbName, dbUsername, dbPassword);

        return con;

    }
}