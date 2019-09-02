package LatDB;

import java.sql.*;
import LatDB.DatabaseConnection;

public class Update {
    public static void main(String[] args) {
        String id = "id5";
        String newFullname = "geeks for geeks 5";
        String newEmail = "geeks5@gmail.com";

        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();

            // Update Query
            String ql = "update userid set fullname = '" + newFullname + "', email = '" + newEmail + "' WHERE id = '"
                    + id + "'";
            int x = stmt.executeUpdate(ql);

            if (x > 0) {
                System.out.println("Fullname and Email Succesfully updated");
            } else {
                System.out.println("Error Occured");
            }
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}