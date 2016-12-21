package Test;

import NoUtil.Number3;
import junit.framework.TestCase;

public class Number3Test extends TestCase {

    public void test_number3_divide_3() throws Exception {
        Number3 number3 = new Number3();

        assertTrue(number3.divide(3));
    }

    public void test_number3_getValue_from_3_expected_fizz() throws Exception {
        Number3 number3 = new Number3();

        assertEquals("fizz" , number3.getValues(3));
    }

    public void test_number3_getValue_from_4_expected_str4() throws Exception {
        Number3 number3 = new Number3();

        assertEquals("4" , number3.getValues(4));
    }
}
