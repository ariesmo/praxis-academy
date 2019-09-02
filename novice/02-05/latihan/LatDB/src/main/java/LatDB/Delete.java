package LatDB;

import java.sql.*;
import LatDB.DatabaseConnection;

public class Delete {
    public static void main(String[] args) {
        String id = "id5";
        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();

            // Delete Query
            String ql = "Delete from userid where id = '" + id + "'";
            int x = stmt.executeUpdate(ql);

            if (x > 0) {
                System.out.println("One user successfully deleted");
            } else {
                System.out.println("ERROR OCCURED");
            }

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}