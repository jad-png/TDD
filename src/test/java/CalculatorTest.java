import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest {
    private Calculator calcul;

    @BeforeEach
    void setUp() {
        this.calcul = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calcul = null;
    }

    @Test
    void testAddition() {
        int result = calcul.add(2, 4);
    }

    @Test
    void testDivision() {
        int result = calcul.division(10, 2);
        assertEquals(5, result, "10/2 should equal 5");
    }

    @Test
    void testDivisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calcul.division(10, 0));
    }
}