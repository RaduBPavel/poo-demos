package main.cum_se_scriu_teste;

import org.junit.jupiter.api.*;

/***
 * Incercati sa scrieti teste pentru cazurile favorabile si cele nefavorabile
 * Incercati fie sa folositi adnotari de nume (@DisplayName(nume) sau un nume explicit metodei)
 * Incercati cand folositi valori de testare sa le declarati ca fiind static final in cadrul clasei
 */
public class TestCalculator {
    private Calculator calculator;
    private static final int FIRST_NUMBER = 2;
    private static final int SECOND_NUMBER = 3;
    private static final int CORRECT_ADD_RESULT = 5;
    private static final int INCORRECT_ADD_RESULT = 4;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void cleanUp() {
        calculator = null;
    }

    @DisplayName("Adding two numbers")
    @Test
    public void testAdd() {
        Assertions.assertEquals(calculator.add(FIRST_NUMBER, SECOND_NUMBER), CORRECT_ADD_RESULT); // cazul pozitiv
        Assertions.assertNotEquals(calculator.add(FIRST_NUMBER, SECOND_NUMBER), INCORRECT_ADD_RESULT); // cazul negativ
    }
}
