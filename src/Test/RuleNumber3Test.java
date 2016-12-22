package Test;

import NoUtil.RuleNumber3;
import junit.framework.TestCase;

public class RuleNumber3Test extends TestCase {
    RuleNumber3 rule3 = new RuleNumber3();

    public void test_RuleNumber3_isSatisfyFor_3() throws Exception {
        assertTrue(rule3.isSatisfyFor(3));
    }

    public void test_RuleNumber3_not_isSatisfy_4() throws Exception {
        assertFalse(rule3.isSatisfyFor(4));
    }

    public void test_RuleNumber3_apply_expected_fizz() throws Exception {
        assertEquals("fizz" , rule3.apply());
    }

}
