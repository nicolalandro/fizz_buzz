package NoUtil;


public class SostitutionRuleNumber5 implements SostitutionRuleInterface {
    public boolean isSatisfyFor(int number) {
        return number%5==0;
    }

    public String getValue() {
        return "buzz";
    }
}
