package NoUtil;


public class FizzBuzz {

    public String getValue(int number) {
        Number3 number3 = new Number3();
        Number5 number5 = new Number5();
        Number7 number7 = new Number7();

        if(number3.divide(number)){
            return number3.getValues(number);
        }
        else if(number5.divide(number)){
            return "buzz";
        }
        else if(number7.divide(number)){
            return "bang";
        }

        return Integer.toString(number);
    }
}
