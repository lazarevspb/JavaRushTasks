package test.com.javarush.task.task18.task1820; 

import org.junit.Test;

import static com.javarush.task.task18.task1820.Solution.*;
import static org.junit.Assert.assertEquals;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>нояб. 15, 2020</pre> 
* @version 1.0 
*/ 
public class SolutionTest { 


/** 
* 
* Method: stringFormat(double value) 
*
*/
@Test
public void testStringFormat() throws Exception {
    assertEquals(" 3", stringFormat( 3.49));
    assertEquals(" 4", stringFormat( 3.50));
    assertEquals(" 4", stringFormat( 3.51));
    assertEquals("-3", stringFormat(-3.49));
    assertEquals("-3", stringFormat(-3.50));
    assertEquals("-4", stringFormat(-3.51));

}

    @Test
    public void testDecimalFormat() throws Exception {
        assertEquals("3", decimalFormat( 3.49));
        assertEquals("4", decimalFormat( 3.50));
        assertEquals("4", decimalFormat( 3.51));
        assertEquals("-3", decimalFormat(-3.49));
        assertEquals("-3", decimalFormat(-3.50));
        assertEquals("-4", decimalFormat(-3.51));

    }

    @Test
    public void testMatchRounding() throws Exception {
        assertEquals(" 3",  matchRounding( 3.49));
        assertEquals(" 4",  matchRounding( 3.50));
        assertEquals(" 4",  matchRounding( 3.51));
        assertEquals("-3", matchRounding(-3.49));
        assertEquals("-3", matchRounding(-3.50));
        assertEquals("-4", matchRounding(-3.51));




    }

    @Test
    public void testMatchRoundingRound() throws Exception {
        assertEquals(" 3", matchRoundingRound(3.49));
        assertEquals(" 4", matchRoundingRound(3.50));
        assertEquals(" 4", matchRoundingRound(3.51));
        assertEquals("-3", matchRoundingRound(-3.49));
        assertEquals("-3", matchRoundingRound(-3.50));
        assertEquals("-4", matchRoundingRound(-3.51));

    }



} 
