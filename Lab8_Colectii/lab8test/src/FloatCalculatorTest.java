
import org.junit.jupiter.api.*;

public class FloatCalculatorTest {
    private FloatCalculator calculator;

    @BeforeEach
    public void setUp() {
        this.calculator = new FloatCalculator();
    }

    @AfterEach
    public void clean() {
        this.calculator = null;
    }

    @Test
    @DisplayName("Add test")
    public void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3));
        Assertions.assertNotEquals(5, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply test")
    public void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertNotEquals(7.5f, calculator.multiply(2.5f, 4));
    }

    @Test
    @DisplayName("Divide test")
    public void testDivide() {
        Assertions.assertEquals(10, calculator.divide(100, 10));
        Assertions.assertNotEquals(5.5f, calculator.divide(55, 12));
    }

    @Test
    @DisplayName("IsNegative test")
    public void testIsNegative() {
        Assertions.assertTrue(calculator.isNegative(-5));
        Assertions.assertFalse(calculator.isNegative(10));
    }
}