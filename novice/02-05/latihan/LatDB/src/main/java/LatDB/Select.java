package LatDB;

import java.sql.*;

import LatDB.DatabaseConnection;

public class Select {
    public static void main(String[] args) {
        String id = "id2";

        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();

            // SELECT Query
            String ql = "select * from userid where id = '" + id + "'";
            ResultSet rs = stmt.executeQuery(ql);
            if (rs.next()) {
                System.out.println("User-id : " + rs.getString(1));
                System.out.println("Fullname : " + rs.getString(3));
                System.out.println("E-mail : " + rs.getString(4));
            } else {
                System.out.println("No such user id is already registered.");
            }

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}