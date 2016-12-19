package Test;

import NoUtil.FizzBuzzComparer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by nick on 19/12/16.
 */
public class FizzBuzzComparerTest {

    @Test
    public void creation(){
        FizzBuzzComparer comparer = new FizzBuzzComparer();
        assertNotEquals(null, comparer);
    }

    @Test
    public void expected_1_FromInput1(){
        FizzBuzzComparer comparer = new FizzBuzzComparer();
        assertEquals("1", comparer.compare(1));
    }

    @Test
    public void expected_fizz_FromInput3(){
        FizzBuzzComparer comparer = new FizzBuzzComparer();
        assertEquals("fizz", comparer.compare(3));
    }

    @Test
    public void expected_fizz_FromInput5(){
        FizzBuzzComparer comparer = new FizzBuzzComparer();
        assertEquals("buzz", comparer.compare(5));
    }
}
