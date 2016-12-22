package Main;

import NoUtil.*;

import java.util.ArrayList;


public class main {

    public static void main (String args[]){
        ArrayList<SostitutionRuleInterface> rule = new ArrayList();
        rule.add(new SostitutionRuleNumber0());
        rule.add(new SostitutionRuleNumber3());
        rule.add(new SostitutionRuleNumber5());
        rule.add(new SostitutionRuleNumber7());

        FizzBuzz fizzBuzz = new FizzBuzz(rule);

        for(int i=1;i<=100;i++){
            System.out.println(fizzBuzz.getValue(i));
        }
    }

}
