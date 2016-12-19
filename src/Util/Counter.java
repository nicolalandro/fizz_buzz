package Util;

/**
 * Created by nick on 16/12/16.
 */
public class Counter {
    private int actual;

    public Counter(int start) {
        this.actual = start;

    }

    public String next() {
        String output = Integer.toString(actual);

        if(actual%3==0){
            output= "fizz";
        }

        else if(actual%5==0){
            output= "buzz";
        }

        actual++;

        return output;
    }
}
