import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(9, calculator.add(4, 5), "Addition method failed");
        assertEquals(-1, calculator.add(-4, 3), "Addition method with negative number failed");
        assertEquals(0, calculator.add(0, 0), "Addition of zeros failed");
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(5, 4), "Difference method failed");
        assertEquals(-7, calculator.dif(-4, 3), "Difference method with negative number failed");
        assertEquals(0, calculator.dif(0, 0), "Difference of zeros failed");
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(10, 5), "Division method failed");
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0), "Division by zero should throw ArithmeticException");
    }

    @Test
    void times() {
        assertEquals(20, calculator.times(4, 5), "Multiplication method failed");
        assertEquals(-12, calculator.times(-4, 3), "Multiplication method with negative number failed");
        assertEquals(0, calculator.times(0, 5), "Multiplication by zero failed");
    }

    @Test
    void solver() {
        assertEquals(18, calculator.solver(), "Solver method failed");
    }
}
