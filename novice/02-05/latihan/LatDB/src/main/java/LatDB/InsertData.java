package LatDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import LatDB.DatabaseConnection;

public class InsertData {
    public static void main(String[] args) {
        String id = "id5";
        String pwd = "pwd5";
        String fullname = "geeks for geeks";
        String email = "geeks@geeks.org";

        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();

            // inserting data
            String ql = "insert into userid values('" + id + "', '" + pwd + "', '" + fullname + "', '" + email + "')";

            int x = stmt.executeUpdate(ql);
            if (x > 0)
                System.out.println("Successfully Inserted Data");
            else
                System.out.println("Insert Failed");

            con.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}