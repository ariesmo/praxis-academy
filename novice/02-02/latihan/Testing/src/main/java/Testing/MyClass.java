package Testing;

public class MyClass {
    public int multiply(int x, int y){
        if (x > 999){
            throw new IllegalArgumentException("X should be less then 1000");
        }
        return x * y;
    }
}