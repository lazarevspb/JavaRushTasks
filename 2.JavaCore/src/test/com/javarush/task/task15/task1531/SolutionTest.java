package test.com.javarush.task.task15.task1531;


import com.javarush.task.task15.task1531.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void factorial() {
        assertEquals("1", Solution.factorial(0));
        assertEquals("0", Solution.factorial(-1));
        assertEquals("6", Solution.factorial(3));
        assertEquals("24", Solution.factorial(4));
        assertEquals("120", Solution.factorial(5));
        assertEquals("720", Solution.factorial(6));
        assertEquals("5040", Solution.factorial(7));
        assertEquals("40320", Solution.factorial(8));
        assertEquals("362880", Solution.factorial(9));
        assertEquals("3628800", Solution.factorial(10));
    }
}