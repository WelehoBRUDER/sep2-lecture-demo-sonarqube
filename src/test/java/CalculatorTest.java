import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(20.0, Calculator.addNumbers(5.0, 15.0));
    }

    @Test
    void testSubtract() {
        assertEquals(-10.0, Calculator.subtractNumbers(5.0, 15.0));
    }

    @Test
    void testMultiply() {
        assertEquals(10.0, Calculator.multiplyNumbers(5.0, 2.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculator.divideNumbers(5.0, 2.5));
    }
}
