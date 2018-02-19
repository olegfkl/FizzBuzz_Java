import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        FizzBuzz test  = new FizzBuzz();
        String result = test.play(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testBuzz() {
        FizzBuzz anotherInstance  = new FizzBuzz();
        assertEquals("Buzz", anotherInstance.play(5));
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzz yetAnotherInstance  = new FizzBuzz();
        assertEquals("FizzBuzz", yetAnotherInstance.play(15));
    }

    @Test
    public void testDefault() {
        FizzBuzz defaultNumber = new FizzBuzz();
        assertEquals("17", defaultNumber.play(17));
    }



}