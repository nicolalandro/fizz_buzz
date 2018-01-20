import org.junit.Test;
import util.Counter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by nick on 16/12/16.
 */
public class CounterTest {

    @Test
    public void creation() {
        Counter c = new Counter(1); //TODO counter non c
        assertNotEquals(c, null);
    }

    @Test
    public void iterationOne() { //TODO nome significativo anche lungo es. mi aspetto di ricevere uno partendo da uno
        Counter c = new Counter(1);
        assertEquals(Integer.toString(1), c.next());
    }

    @Test
    public void iterationThree() {
        Counter c = new Counter(3);
        assertEquals("fizz", c.next());
    }

    @Test
    public void iterationFive() {
        Counter c = new Counter(5);
        assertEquals("buzz", c.next());
    }

    //TODO secondario: completare i casi di test

}
