package NoUtil;


public class RuleNumber3 implements RuleInterface {
    public boolean isSatisfyFor(int number) {
        return number%3==0;
    }

    public String apply() {
            return "fizz";
    }
}
