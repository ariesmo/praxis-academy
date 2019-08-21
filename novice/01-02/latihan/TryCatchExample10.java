import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample10 {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); // may throw except
            pw.println("saved");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}