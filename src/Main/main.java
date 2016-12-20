package Main;

import NoUtil.FizzBuzz;

/**
 * Created by nick on 16/12/16.
 */
public class main {

    public static void main (String args[]){
        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i=1;i<=100;i++){
            System.out.println(fizzBuzz.getValue(i));
        }
    }

}
