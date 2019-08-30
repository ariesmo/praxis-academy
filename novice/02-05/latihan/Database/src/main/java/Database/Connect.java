package Database;

import java.sql.*;

public class Connect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/AMROOD", "root", null)) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                // execute query
                try (ResultSet rs = stmt.executeQuery("SELECT 'Connected'")) {
                    // position result to first
                    rs.first();
                    System.out.println(rs.getString(1)); // result is "Hello World!"
                }
            }
        }
    }
}
