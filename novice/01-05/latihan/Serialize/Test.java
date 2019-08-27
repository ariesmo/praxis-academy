import java.io.*;

class Demo implements Serializable {
    public int a;
    public String b;

    // Default COnstructor
    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class Test {
    public static void main(String[] args) {
        Demo object = new Demo(1, "geeksforgeeks");
        String filename = "file.ser";

        // Serialization
        try {
            // saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);
            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            // TODO: handle exception
            System.out.println("IOException is cought");
        }

        Demo object1 = null;

        // Deserialization
        try {
            // reading the object frol a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // method for desrialization of object
            object1 = (Demo) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch (IOException ex) {
            // TODO: handle exception
            System.out.println("IOException is caught");
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}