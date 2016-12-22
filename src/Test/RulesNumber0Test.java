package Test;

import NoUtil.RuleNumber0;
import junit.framework.TestCase;

public class RulesNumber0Test extends TestCase {
    RuleNumber0 rule0 = new RuleNumber0();

    public void test_RuleNumber0_isSatisfyFor_0() throws Exception {
        assertTrue(rule0.isSatisfyFor(0));
    }

    public void test_RuleNumber0_not_isSatisfyFor_1() throws Exception {
        assertFalse(rule0.isSatisfyFor(1));
    }

    public void test_RuleNumber0_apply_expect_0(){
        assertEquals("0", rule0.apply());
    }
}
