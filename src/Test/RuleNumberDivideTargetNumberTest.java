package Test;

import NoUtil.RuleNumberDivideTargetNumber;
import junit.framework.TestCase;

public class RuleNumberDivideTargetNumberTest extends TestCase{
    public void test_number3_divide_3() throws Exception {
        RuleNumberDivideTargetNumber ruleNumber3 = new RuleNumberDivideTargetNumber(3, "fizz");
        assertTrue(ruleNumber3.isSatisfyFor(3));
    }

    public void test_number3_applyRule_expected_fizz(){
        RuleNumberDivideTargetNumber ruleNumber3 = new RuleNumberDivideTargetNumber(3, "fizz");
        assertEquals("fizz",ruleNumber3.apply());
    }
}
