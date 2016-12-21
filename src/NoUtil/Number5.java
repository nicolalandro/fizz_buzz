package NoUtil;


public class Number5 implements NumberInterface{
    public boolean divide(int number) {
        return number%5==0;
    }

    public String getValues() {
        return "buzz";
    }
}
