import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerCheckerTest {

    private IIntegerChecker checker;

    @BeforeEach
    public void setup() {
        this.checker = new IntegerChecker();
    }

    @Test
    public void enter1GetBackTrue() {
        // Given: I am a user
        // When: I enter the string "1"
        boolean result = checker.isInteger("1");
        // Then: I get back TRUE
        assertTrue(result);
    }

    @Test
    public void enterBobGetBackFalse() {
        // Given: I am a user
        // When: I enter the string "bob"
        boolean result = checker.isInteger("bob");
        // Then: I get back FALSE
        assertFalse(result);
    }

    @Test
    public void enterDecimalGetBackFalse() {
        // Given: I am a user
        // When: I enter the string "2.5"
        boolean result = checker.isInteger("2.5");
        // Then: I get back FALSE
        assertFalse(result);
    }

    @Test
    public void givenNegativeGetTrue() {
        // Given I am a user
        // When I enter the string -4
        boolean result = checker.isInteger("-4");
        // Then I get back true
        assertTrue(result);
    }
}
