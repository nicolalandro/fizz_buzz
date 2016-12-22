package Test;

import NoUtil.SostitutionRuleNumber3;
import junit.framework.TestCase;

public class SostitutionRuleNumber3Test extends TestCase {
    SostitutionRuleNumber3 rule3 = new SostitutionRuleNumber3(); //TODO il nome va cambiato: regola

    public void test_number3_divide_3() throws Exception {
        assertTrue(rule3.isSatisfyFor(3));
    }

    public void test_number3_not_divide_4() throws Exception {
        assertFalse(rule3.isSatisfyFor(4));
    }

    public void test_number3_getValue_from_3_expected_fizz() throws Exception {

        assertEquals("fizz" , rule3.getValue());
    }

}
