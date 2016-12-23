package NoUtil;


public class RuleNumberDivideTargetNumber implements RuleInterface{
    //entrambi anche final
    private int divider;
    private String stringRule;

    public RuleNumberDivideTargetNumber(int divider, String stringRule) {
        this.divider = divider;
        this.stringRule = stringRule;
    }

    @Override
    public boolean isSatisfyFor(int number) {
        return number%divider==0;
    }

    @Override
    public String apply() {
        return stringRule;
    }
}
