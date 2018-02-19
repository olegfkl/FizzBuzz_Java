import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test

    public void test() {
        FizzBuzz test  = new FizzBuzz();
        String result = test.play(3);
        assertEquals("Fizz", result);
    }

}