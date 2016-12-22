package Main;

import NoUtil.*;

import java.util.ArrayList;


public class main {

    public static void main (String args[]){
        ArrayList<RuleInterface> rule = new ArrayList();
        rule.add(new RuleNumber0());
        rule.add(new RuleNumber3());
        rule.add(new RuleNumber5());
        rule.add(new RuleNumber7());

        FizzBuzz fizzBuzz = new FizzBuzz(rule);

        for(int i=1;i<=100;i++){
            System.out.println(fizzBuzz.getValue(i));
        }
    }

}
