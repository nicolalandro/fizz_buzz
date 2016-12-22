package NoUtil;

public class RuleNumber0 implements RuleInterface {
    public boolean isSatisfyFor(int number) {
        return number==0;
    }

    public String apply() {
        return "0";
    }
}
