package NoUtil;

/**
 * Created by nick on 19/12/16.
 */
public class FizzBuzzComparer {

    public String compare(int number) {
        if(number%3==0){
            return "fizz";
        }
        else if(number%5==0){
            return "buzz";
        }

        return Integer.toString(number);
    }
}
