package NoUtil;


public class Number7 {
    public boolean divide(int number) {
        return number%7==0;
    }

    public String getValues(int number) {
        if(divide(number)){
            return "bang";
        }
        return Integer.toString(number);
    }
}
