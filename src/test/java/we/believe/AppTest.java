package we.believe;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testTwoNumber()
    {
        TwoSum twoSum = new TwoSum();

        assertTrue(Arrays.equals(twoSum.twoSum(new int[]{3, 4, 5}, 8), new int[]{1, 3}));
    }
}
