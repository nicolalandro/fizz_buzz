package Test;

import NoUtil.FizzBuzz;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class FizzBuzzTest extends TestCase {
    FizzBuzz fizzBuzz = new FizzBuzz();
    public void test_creation()throws Exception{
        assertNotEquals(null, fizzBuzz);
    }

    public void test_expected_1_FromInput1()throws Exception{
        assertEquals("1", fizzBuzz.getValue(1));
    }

    public void test_expected_fizz_FromInput3()throws Exception{
        assertEquals("fizz", fizzBuzz.getValue(3));
    }

    public void test_expected_fizz_FromInput5()throws Exception{
        assertEquals("buzz", fizzBuzz.getValue(5));
    }

    public void test_expected_bang_FromInput7()throws Exception{
        assertEquals("bang", fizzBuzz.getValue(7));
    }
}
