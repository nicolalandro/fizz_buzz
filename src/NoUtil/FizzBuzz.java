package NoUtil;


import java.util.ArrayList;

public class FizzBuzz {
    private  ArrayList<SostitutionRuleInterface> listOfRule;
    public FizzBuzz(){
        this.listOfRule = new ArrayList();

        this.listOfRule.add(new SostitutionRuleNumber0());
        this.listOfRule.add(new SostitutionRuleNumber3());
        this.listOfRule.add(new SostitutionRuleNumber5());
        this.listOfRule.add(new SostitutionRuleNumber7());
    }

    public String getValue(int number) {


        //TODO if(number==0) è un problema comune a tutti i numeri quindi per non duplicare il controllo converrebe farlo qui,
        // però logicamente dovrebbe stare nel metodo divide

        //sto supponendo che dato un input una e una sola regola viene applicata, e si può stabilire una gerarchia di regole

        for(SostitutionRuleInterface rule : listOfRule){ //la gerarchia di regole si applica nell'ordine degli elementi inseriti nella lista
            if(rule.divide(number)){
                return rule.getValue();
            }
        }

        return Integer.toString(number);
    }
}
