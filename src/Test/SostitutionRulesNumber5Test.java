package Test;

import NoUtil.SostitutionRuleNumber5;
import junit.framework.TestCase;

public class SostitutionRulesNumber5Test extends TestCase{
    SostitutionRuleNumber5 rule5 = new SostitutionRuleNumber5();

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
