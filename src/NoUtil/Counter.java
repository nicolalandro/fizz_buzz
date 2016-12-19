package NoUtil;

/**
 * Created by nick on 19/12/16.
 */
public class Counter {
    private int actualValue;

    public Counter(int startValue) {
        actualValue = startValue;
    }

    public int getActualValue() {
        return actualValue;
    }

    public void increment() {
        actualValue++;
    }
}
