package NoUtil;


public class Number3 {
    public boolean divide(int number) {
        return number%3==0;
    }

    public String getValues(int number) {
        if(divide(number)){
            return "fizz";
        }

        return Integer.toString(number);
    }
}
