import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz test;

    @Before
    public void initObjects() {
        test  = new FizzBuzz();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", test.play(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", test.play(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", test.play(15));
    }

    @Test
    public void testDefault() {
        assertEquals("17", test.play(17));
    }



}