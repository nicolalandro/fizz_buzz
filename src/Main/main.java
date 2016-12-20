package Main;

import NoUtil.FizzBuzzComparer;

/**
 * Created by nick on 16/12/16.
 */
public class main {

    public static void main (String args[]){
        FizzBuzzComparer comparer = new FizzBuzzComparer();

        for(int i=1;i<=100;i++){
            System.out.println(comparer.compare(i));
        }
    }

}
