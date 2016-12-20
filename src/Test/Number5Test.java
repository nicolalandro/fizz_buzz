package Test;

import NoUtil.Number5;
import junit.framework.TestCase;

public class Number5Test extends TestCase{
    public void test_number5_divide_5() throws Exception {
        Number5 number5 = new Number5();
        assertTrue(number5.divide(5));
    }
}
