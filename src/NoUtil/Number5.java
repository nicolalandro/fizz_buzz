package NoUtil;


public class Number5 {
    public boolean divide(int number) {
        return number%5==0;
    }

    public String getValues(int number) {
        if(divide(number)){
            return "buzz";
        }

        return Integer.toString(number);
    }
}
