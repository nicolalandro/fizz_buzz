package Test;

import NoUtil.Counter;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by nick on 19/12/16.
 */
public class CounterTest {

    @Test
    public void create(){
        Counter counter = new Counter(1);
        assertNotEquals(null,counter);
    }

    @Test
    public void expected_1_FromGetActualValue(){
        Counter counter = new Counter(1);
        assertEquals(1,counter.getActualValue());
    }

    @Test

    public void expected_2_FromIncrementActualValue(){
        Counter counter = new Counter(1);
        counter.increment();
        assertEquals(2,counter.getActualValue());
    }
}
