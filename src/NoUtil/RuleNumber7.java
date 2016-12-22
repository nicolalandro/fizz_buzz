package NoUtil;


public class RuleNumber7 implements RuleInterface {
    public boolean isSatisfyFor(int number) {
        return number%7==0;
    }

    public String apply() {
        return "bang";
    }
}
