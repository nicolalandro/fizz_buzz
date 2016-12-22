package Test;

import NoUtil.SostitutionRuleNumber7;
import junit.framework.TestCase;


public class SostitutionRuleNumber7Test extends TestCase {
    SostitutionRuleNumber7 rule7 = new SostitutionRuleNumber7();
    public void test_number7_divide_7() throws Exception {
        assertTrue(rule7.isSatisfyFor(7));
    }

    public void test_number7_not_divide_8() throws Exception {
        assertFalse(rule7.isSatisfyFor(8));
    }

    public void test_number7_getValue_from_7_expected_bang(){
        assertEquals("bang", rule7.getValue());
    }

}
