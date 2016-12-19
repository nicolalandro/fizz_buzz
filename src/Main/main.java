package Main;

import NoUtil.OutputCreator;

/**
 * Created by nick on 16/12/16.
 */
public class main {

    public static void main (String args[]){
        OutputCreator outputCreator = new OutputCreator(1);

        for(int i=1;i<=100;i++){
            System.out.println(outputCreator.next());
        }
    }

}
