package test.com.javarush.task.task14.task1420; 

import org.junit.Test; 

import static com.javarush.task.task14.task1420.Solution.getGreatestCommonFactor;
import static org.junit.Assert.assertEquals;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>окт. 26, 2020</pre> 
* @version 1.0 
*/ 
public class SolutionTest { 


/** 
* 
* Method: getGreatestCommonFactor(int a, int b) 
* 
*/ 
@Test
public void testGetGreatestCommonFactor() throws Exception {
    assertEquals(20, getGreatestCommonFactor(100, 40));
    assertEquals(6, getGreatestCommonFactor(24, 18));
    assertEquals(4, getGreatestCommonFactor(28, 16));
    assertEquals(8, getGreatestCommonFactor(72, 128));
    assertEquals(17, getGreatestCommonFactor(34, 1717));
}



} 
