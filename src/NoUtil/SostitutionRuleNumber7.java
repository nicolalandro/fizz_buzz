package NoUtil;


public class SostitutionRuleNumber7 implements SostitutionRuleInterface {
    public boolean divide(int number) {
        return number%7==0;
    }

    public String getValue() {
        return "bang";
    }
}
