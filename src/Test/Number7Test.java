package Test;

import NoUtil.Number7;
import junit.framework.TestCase;


public class Number7Test extends TestCase {
    Number7 number7 = new Number7();
    public void test_number7_divide_7() throws Exception {

        assertTrue(number7.divide(7));
    }

    public void test_number7_getValue_from_7_expected_bang(){
        assertEquals("bang",number7.getValues());
    }

}
