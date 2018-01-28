import org.junit.Test;
import util.Counter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Fail {
    @Test
    public void creation() {
        assertNotEquals(1, 0);
    }
}
