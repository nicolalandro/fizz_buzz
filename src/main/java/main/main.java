package main;


import util.Counter;

/**
 * Created by nick on 16/12/16.
 */
public class main {

    public static void main (String args[]){
        Counter c = new Counter(1);

        for(int i=1;i<=100;i++){
            System.out.println(c.next());
        }
    }

}
