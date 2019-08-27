package Testing;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculatorTest {
	Calculator calculator;

	@Before
	public void init(){
		calculator = new Calculator();
	}

	@Test
	public void testKali(){
		assertEquals(20, calculator.kali(10,2), 0);
	}

	@Test
    public void testBagi() {
        assertEquals(5, calculator.bagi(10, 2),0);
    }
 
    @Test
    public void testTambah() {
        assertEquals(12, calculator.tambah(10, 2),0);
    }
 
    @Test
    public void testKurang() {
        assertEquals(8, calculator.kurang(10, 2),0);
    }
}