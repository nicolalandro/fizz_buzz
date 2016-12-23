package NoUtil;


import java.util.ArrayList;

public class FizzBuzz {
    private  ArrayList<RuleInterface> listOfRule; //SOLID OCP
    public FizzBuzz(ArrayList<RuleInterface> rules){
        this.listOfRule = rules;
    }

    public String getValue(int number) {

        //sto supponendo che dato un input una e una sola regola viene applicata, e si può stabilire una gerarchia di regole

        for(RuleInterface rule : listOfRule){ //la gerarchia di regole si applica nell'ordine degli elementi inseriti nella lista
                                                //SOLID SRP
            if(rule.isSatisfyFor(number)){
                return rule.apply();
            }
        }

        return Integer.toString(number);
    }
}
