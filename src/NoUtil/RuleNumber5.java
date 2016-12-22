package NoUtil;


public class RuleNumber5 implements RuleInterface {
    public boolean isSatisfyFor(int number) {
        return number%5==0;
    }

    public String apply() {
        return "buzz";
    }
}
