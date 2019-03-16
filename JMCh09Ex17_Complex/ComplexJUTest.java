import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;


/**
 * Plugs numbers in to Test for the complex number class.
 * 
 * testConstructor1Param - test the 1 parameter constructor
 * testConstructor2Param - test the 2 parameter constructor
 * testAddRealAndComplexNum - addition of a complex number with a real number
 * testAdd2ComplexNums - addition of two complex numbers
 * testMultiply2ComplexNums - multiplication of two complex numbers
 * testMultiplyRealAndComplexNum - multiplication of a complex number with a
 * real number testAbsoluteValue - absolute value of a complex number
 *
 * @author Albert Su
 * @version 10/1/2017
 * @author Period: 2
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: Fulk
 */
public class ComplexJUTest extends junit.framework.TestCase
{
    @Test
    /**
     * what was new assertEquals? test of number that is not complex is or not
     * complex
     */
    public void testConstructor1Param()
    {
        Complex c = new Complex( 10 );
        assertEquals( "10.0 + 0.0i", c.toString() );
    }


    /**
     * Tests if two parameters test the two numbers if they are equal
     */
    @Test
    public void testConstructor2Param()
    {
        Complex c1 = new Complex( 2, 1 );
        assertEquals( "2.0 + 1.0i", c1.toString() );
    }


    /**
     * 
     * adds to real and complex numbers
     */
    @Test
    public void testAddRealAndComplexNum()
    {
        Complex c2 = new Complex( 2, 3 );
        Complex c = c2.add( 3.3 );
        assertEquals( "5.3 + 3.0i", c.toString() );
    }


    /**
     * assertEquals(a,b,c) adds 2 complex number together
     */
    @Test
    public void testAdd2ComplexNums()
    {
        Complex c2 = new Complex( 3, 3 );
        Complex c = c2.add( new Complex( 4, 5 ) );
        assertEquals( "7.0 + 8.0i", c.toString() );
    }


    /**
     * 
     * multiplies two complex numbers
     */
    @Test
    public void testMultiply2ComplexNums()
    {
        Complex c1 = new Complex( 1, 2 );
        Complex c2 = new Complex( 5, 4 );
        Complex c3 = c2.multiply( c1 );
        assertEquals( "-3.0 + 14.0i", c3.toString() );
    }


    /**
     * 
     * multiplies a complex by a double
     */
    @Test
    public void testMultiplyRealAndComplexNum()
    {
        Complex c = new Complex( 2, 1 );
        Complex ans = c.multiply( 4.0 );
        assertEquals( "8.0 + 4.0i", ans.toString() );
    }


    /**
     * 
     * takes absolute value of a complex number
     */
    @Test
    public void testAbsoluteValue()
    {
        Complex c2 = new Complex( 3, 4 );
        assertEquals( 5.0, c2.abs(), .01 );
    }


    /**
     * 
     * does something weird
     * 
     * @return new j unit test?
     */
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( ComplexJUTest.class );
    }


    /**
     * 
     * Main Method
     * 
     * @param args what it prints/tests?
     */
    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "ComplexJUTest" );
    }
}
