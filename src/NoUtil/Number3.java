package NoUtil;


public class Number3 implements NumberInterface{
    public boolean divide(int number) {
        return number%3==0;
    }

    public String getValues() {
            return "fizz";
    }
}
