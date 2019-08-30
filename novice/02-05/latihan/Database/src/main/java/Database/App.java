package Database;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        // create connection for a server installed in localhost, with a user "root"
        // with no password
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/AMROOD", "root", null)) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                // execute query
                try (ResultSet ab = stmt.executeQuery("SELECT 'Testing'")) {
                    // position result to first
                    ab.first();
                    System.out.println(ab.getString(1)); // result is "Hello World!"
                }
            }
        }
    }
}