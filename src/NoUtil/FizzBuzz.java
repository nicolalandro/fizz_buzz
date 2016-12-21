package NoUtil;


public class FizzBuzz {

    public String getValue(int number) {
        Number3 number3 = new Number3();
        Number5 number5 = new Number5();
        Number7 number7 = new Number7();

        if(number3.divide(number)){
            return number3.getValues();
        }
        else if(number5.divide(number)){
            return number5.getValues();
        }
        else if(number7.divide(number)){
            return number7.getValues();
        }

        return Integer.toString(number);
    }
}
