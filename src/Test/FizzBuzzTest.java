package Test;

import NoUtil.*;
import junit.framework.TestCase;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class FizzBuzzTest extends TestCase {
    FizzBuzz fizzBuzz;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ArrayList<RuleInterface> rule = new ArrayList();
        rule.add(new RuleNumber0());
        rule.add(new RuleNumber3());
        rule.add(new RuleNumber5());
        rule.add(new RuleNumber7());

        fizzBuzz = new FizzBuzz(rule);
    }

    public void test_creation()throws Exception{
        assertNotEquals(null, fizzBuzz);
    }

    public void test_expected_0_FromInput0()throws Exception{
        assertEquals("0", fizzBuzz.getValue(0));
    }

    public void test_expected_1_FromInput1()throws Exception{
        assertEquals("1", fizzBuzz.getValue(1));
    }



    public void test_expected_fizz_FromInput3()throws Exception{
        assertEquals("fizz", fizzBuzz.getValue(3));
    }

    public void test_expected_fizz_FromInput9()throws Exception{
        assertEquals("fizz", fizzBuzz.getValue(9));
    }



    public void test_expected_buzz_FromInput5()throws Exception{
        assertEquals("buzz", fizzBuzz.getValue(5));
    }

    public void test_expected_buzz_FromInput25()throws Exception{
        assertEquals("buzz", fizzBuzz.getValue(25));
    }



    public void test_expected_bang_FromInput7()throws Exception{
        assertEquals("bang", fizzBuzz.getValue(7));
    }

    public void test_expected_bang_FromInput49()throws Exception{
        assertEquals("bang", fizzBuzz.getValue(49));
    }

}
