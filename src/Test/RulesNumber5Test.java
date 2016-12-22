package Test;

import NoUtil.RuleNumber5;
import junit.framework.TestCase;

public class RulesNumber5Test extends TestCase{
    RuleNumber5 rule5 = new RuleNumber5();

    public void test_RuleNumber5_isSatisfyFor_5() throws Exception {
        assertTrue(rule5.isSatisfyFor(5));
    }

    public void test_RuleNumber5_not_isSatisfyFor_6() throws Exception {
        assertFalse(rule5.isSatisfyFor(6));
    }

    public void test_RuleNumber5_apply_expected_buzz() throws Exception {
        assertEquals("buzz" , rule5.apply());
    }

}
