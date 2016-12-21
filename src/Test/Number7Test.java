package Test;

import NoUtil.Number7;
import junit.framework.TestCase;


public class Number7Test extends TestCase {

    public void test_number7_divide_7() throws Exception {
        Number7 number7 = new Number7();
        assertTrue(number7.divide(7));
    }
}
