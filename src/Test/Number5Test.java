package Test;

import NoUtil.Number5;
import junit.framework.TestCase;

public class Number5Test extends TestCase{
    Number5 number5 = new Number5();

    public void test_number5_divide_5() throws Exception {

        assertTrue(number5.divide(5));
    }

    public void test_number5_getValue_from_5_expected_buzz() throws Exception {

        assertEquals("buzz" , number5.getValues(5));

    }

    public void test_number5_getValue_from_6_expected_6() throws Exception {

        assertEquals("6" , number5.getValues(6));

    }
}
