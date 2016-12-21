package Test;

import NoUtil.SostitutionRuleNumber0;
import junit.framework.TestCase;

public class SostitutionRulesNumber0Test extends TestCase {
    SostitutionRuleNumber0 number0 = new SostitutionRuleNumber0();

    public void test_Number0_divide_0() throws Exception {
        assertTrue(number0.divide(0));
    }
    public void test_Number0_getValue_expect_0(){
        assertEquals("0", number0.getValue());
    }
}
