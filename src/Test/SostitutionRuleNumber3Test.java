package Test;

import NoUtil.SostitutionRuleNumber3;
import junit.framework.TestCase;

public class SostitutionRuleNumber3Test extends TestCase {
    SostitutionRuleNumber3 number3 = new SostitutionRuleNumber3(); //TODO il nome va cambiato: regola

    public void test_number3_divide_3() throws Exception {
        assertTrue(number3.divide(3));
    }

    public void test_number3_not_divide_4() throws Exception {
        assertFalse(number3.divide(4));
    }

    public void test_number3_getValue_from_3_expected_fizz() throws Exception {

        assertEquals("fizz" , number3.getValue());
    }

}