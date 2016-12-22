package Test;

import NoUtil.RuleNumber5;
import junit.framework.TestCase;

public class RulesNumber5Test extends TestCase{
    RuleNumber5 rule5 = new RuleNumber5();

    public void test_number5_divide_5() throws Exception {
        assertTrue(rule5.isSatisfyFor(5));
    }

    public void test_number5_not_divide_6() throws Exception {
        assertFalse(rule5.isSatisfyFor(6));
    }

    public void test_number5_getValue_from_5_expected_buzz() throws Exception {
        assertEquals("buzz" , rule5.getValue());
    }

}
