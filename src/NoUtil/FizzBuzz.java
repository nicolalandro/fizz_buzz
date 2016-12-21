package NoUtil;


public class FizzBuzz {

    public String getValue(int number) {
        SostitutionRuleNumber3 number3 = new SostitutionRuleNumber3();
        SostitutionRuleNumber5 number5 = new SostitutionRuleNumber5();
        SostitutionRuleNumber7 number7 = new SostitutionRuleNumber7();

        //TODO if(number==0) è un problema comune a tutti i numeri quindi per non duplicare il controllo converrebe farlo qui,
        // però logicamente dovrebbe stare nel metodo divide

        if(number3.divide(number)){
            return number3.getValue();
        }
        else if(number5.divide(number)){
            return number5.getValue();
        }
        else if(number7.divide(number)){
            return number7.getValue();
        }

        return Integer.toString(number);
    }
}
