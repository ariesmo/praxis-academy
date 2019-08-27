package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import Testing.My;

public class MyTest {

    @Test
    public void divideplicationOfZeroIntegersShouldReturnZero() {
        My testing = new My(); // MyClass is tested

        // assert statements
        assertEquals(0, testing.divide(10, 0), "10 / 0 must be 0");
        assertEquals(0, testing.divide(0, 10), "0 / 10 must be 0");
        assertEquals(0, testing.divide(0, 0), "0 / 0 must be 0");
    }
}





