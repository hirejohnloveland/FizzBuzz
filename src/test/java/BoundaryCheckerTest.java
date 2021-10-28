import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BoundaryCheckerTest {
    @Test
    public void given0GetFalse() {
//        Given: I am a user
//        When: I enter the integer 0
        IBoundaryChecker myBoundary = new BoundaryChecker();
        boolean result = myBoundary.isInsideBoundary(0);
//        Then: I get back FALSE
        assertFalse(result);}


}