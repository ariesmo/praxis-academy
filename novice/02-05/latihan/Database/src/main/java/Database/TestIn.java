package Database;

import java.sql.*;

public class TestIn {
    public static void main(String[] args) {
        String id = "id4";
        String pwd = "pwd4";
        String fullname = "geeks for geeks";
        String email = "geeks@geeks.org";

        try {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/AMROOD", "root", null);
            Statement stmt = con.createStatement();

            String ql = "insert into userid values('" + id + "', '" + pwd + "', '" + fullname + "' , '" + email + "')";
            int x = stmt.executeUpdate(ql);
            if (x > 0)
                System.out.println("Successfully Inserted");
            else
                System.out.println("Insert Failed");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}