package NoUtil;

/**
 * Created by nick on 16/12/16.
 */
public class OutputCreator {
    private Counter actual;

    public OutputCreator(int start) {
        this.actual = new Counter(start);

    }

    public String next() {
        String output = Integer.toString(actual.getActualValue());

        if(actual.getActualValue()%3==0){
            output= "fizz";
        }

        else if(actual.getActualValue()%5==0){
            output= "buzz";
        }

        actual.increment();

        return output;
    }
}
