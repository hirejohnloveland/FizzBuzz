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
        assertFalse(result);
    }

    @Test
    public void given1GetTrue() {
//        Given: I am a user
//        When: I enter the integer 1
        IBoundaryChecker myBoundary = new BoundaryChecker();
        boolean result = myBoundary.isInsideBoundary(1);
//        Then: I get back True
        assertTrue(result);
    }

    @Test
    public void given300GetTrue() {
//        Given: I am a user
//        When: I enter the integer 300
        IBoundaryChecker myBoundary = new BoundaryChecker();
        boolean result = myBoundary.isInsideBoundary(300);
//        Then: I get back True
        assertTrue(result);
    }

    @Test
    public void given301GetFalse() {
//        Given: I am a user
//        When: I enter the integer 301
        IBoundaryChecker myBoundary = new BoundaryChecker();
        boolean result = myBoundary.isInsideBoundary(301);
//        Then: I get back False
        assertFalse(result);
    }


}