package Main;

import NoUtil.FizzBuzz;


public class main {

    public static void main (String args[]){
        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i=1;i<=100;i++){
            System.out.println(fizzBuzz.getValue(i));
        }
    }

}
