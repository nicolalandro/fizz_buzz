package NoUtil;

/**
 * Created by nick on 16/12/16.
 */
public class OutputCreator {
    private Counter current;

    public OutputCreator(int start) {
        this.current = new Counter(start);

    }

    public String next() {
        String output = Integer.toString(current.getActualValue());

        if(current.getActualValue()%3==0){
            output= "fizz";
        }

        else if(current.getActualValue()%5==0){
            output= "buzz";
        }

        current.increment();

        return output;
    }
}
