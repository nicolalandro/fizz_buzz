package Test;

import NoUtil.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by nick on 19/12/16.
 */
public class FizzBuzzTest {

    @Test
    public void creation(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertNotEquals(null, fizzBuzz);
    }

    @Test
    public void expected_1_FromInput1(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1", fizzBuzz.getValue(1));
    }

    @Test
    public void expected_fizz_FromInput3(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("fizz", fizzBuzz.getValue(3));
    }

    @Test
    public void expected_fizz_FromInput5(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("buzz", fizzBuzz.getValue(5));
    }

    @Test
    public void expected_bang_FromInput7(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("bang", fizzBuzz.getValue(7));
    }
}
