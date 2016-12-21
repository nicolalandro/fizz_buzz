package Test;

import NoUtil.SostitutionRuleNumber5;
import junit.framework.TestCase;

public class SostitutionRulesNumber5Test extends TestCase{
    SostitutionRuleNumber5 number5 = new SostitutionRuleNumber5();

    public void test_number5_divide_5() throws Exception {
        assertTrue(number5.satisfyRule(5));
    }

    public void test_number5_not_divide_6() throws Exception {
        assertFalse(number5.satisfyRule(6));
    }

    public void test_number5_getValue_from_5_expected_buzz() throws Exception {
        assertEquals("buzz" , number5.getValue());
    }

}
