import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void given1Get1() {
//        Given: I
//        am a user
//        When: I enter the number 1
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(1);
//        Then: I get back "1"
        assertEquals("1", result);
    }

    @Test
    public void given2Get1_2() {
//        Given: I
//        am a user
//        When: I enter the number 2
        IFizzBuzz fb = new FizzBuzz();
        String result = fb.generate(2);
//        Then: I get back "1"
        assertEquals("1, 2", result);
    }

}