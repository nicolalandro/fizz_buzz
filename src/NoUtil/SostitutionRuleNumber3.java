package NoUtil;


public class SostitutionRuleNumber3 implements SostitutionRuleInterface {
    public boolean satisfyRule(int number) {
        return number%3==0;
    }

    public String getValue() {
            return "fizz";
    }
}
