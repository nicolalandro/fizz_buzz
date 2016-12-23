package NoUtil;

public class RuleNumber0 extends RuleNumberDivideTargetNumber {
    public RuleNumber0() {
        super(0, "0");
    }

    public boolean isSatisfyFor(int number) {
        return number==0;
    }

}
