package Test;

import NoUtil.RuleNumber7;
import junit.framework.TestCase;


public class RuleNumber7Test extends TestCase {
    RuleNumber7 rule7 = new RuleNumber7();
    public void test_number7_divide_7() throws Exception {
        assertTrue(rule7.isSatisfyFor(7));
    }

    public void test_number7_not_divide_8() throws Exception {
        assertFalse(rule7.isSatisfyFor(8));
    }

    public void test_number7_getValue_from_7_expected_bang(){
        assertEquals("bang", rule7.apply());
    }

}
