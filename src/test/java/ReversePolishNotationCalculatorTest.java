import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    static ReversePolishNotationCalculator notationCalculator;

    @BeforeAll
    static void createNotationCalculator() {
        notationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        assertEquals(3, notationCalculator.calculatePolishNotation("1 2 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(1, notationCalculator.calculatePolishNotation("3 2 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(6, notationCalculator.calculatePolishNotation("2 3 *"));
    }

    @Test
    public void shouldCalculateAdditionWithManySpaceChar() {
        assertEquals(3, notationCalculator.calculatePolishNotation("    1   2    +   "));
    }

    @Test
    public void shouldCalculateAdditionWithNegativeValues() {
        assertEquals(2, notationCalculator.calculatePolishNotation("-1 3 +"));
    }
}

