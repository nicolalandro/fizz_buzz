package Test;

import NoUtil.OutputCreator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by nick on 16/12/16.
 */
public class OutputCreatorTest {

    @Test
    public void creation(){
        OutputCreator outputCreator = new OutputCreator(1);
        assertNotEquals(outputCreator,null);

    }

    @Test
    public void expected_1_FromFirstIterationWithNumber1(){
        OutputCreator outputCreator = new OutputCreator(1);
        assertEquals(Integer.toString(1), outputCreator.next());
    }

    @Test
    public void expected_fizz_FromFirstIterationWithNumber3(){
        OutputCreator outputCreator = new OutputCreator(3);
        assertEquals("fizz", outputCreator.next());
    }

    @Test
    public void expected_buzz_FromFirstIterationWithNumber5(){
        OutputCreator outputCreator = new OutputCreator(5);
        assertEquals("buzz", outputCreator.next());
    }

    //TODO secondario: completare i casi di test
    @Test
    public void expected_buzz_From100IterationWithNumber1(){
        OutputCreator outputCreator = new OutputCreator(1);
        for(int i=1;i<=99;i++){
           outputCreator.next();
        }
        assertEquals("buzz", outputCreator.next());
    }

}
