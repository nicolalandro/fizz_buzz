package NoUtil;

public class SostitutionRuleNumber0 implements SostitutionRuleInterface{
    public boolean satisfyRule(int number) {
        return number==0;
    }

    public String getValue() {
        return "0";
    }
}
