package Test;

import NoUtil.RuleNumber15;
import junit.framework.TestCase;

public class RuleNumber15Test extends TestCase{
    RuleNumber15 rule15 = new RuleNumber15();

    public void test_RuleNumber15_isSatisfyFor_15() throws Exception {
        assertTrue(rule15.isSatisfyFor(15));
    }

    public void test_RuleNumber15_not_isSatisfy_4() throws Exception {
        assertFalse(rule15.isSatisfyFor(4));
    }

    public void test_RuleNumber15_apply_expected_fizzbuzz() throws Exception {
        assertEquals("fizzbuzz" , rule15.apply());
    }
}
