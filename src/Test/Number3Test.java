package Test;

import NoUtil.Number3;
import junit.framework.TestCase;

/**
 * Created by nick on 20/12/16.
 */
public class Number3Test extends TestCase {

    public void test_number3_divide_3() throws Exception {
        Number3 number3 = new Number3();

        assertTrue(number3.divide(3));
    }
}
