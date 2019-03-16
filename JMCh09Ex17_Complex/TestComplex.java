// Question 9-17
/**
 * 
 * Did not change
 *
 * @author asu995
 * @version Oct 2, 2017
 * @author Period: 2
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: whoever wrote it
 */
public class TestComplex
{
    /**
     * 
     * main method, did not touch.
     * 
     * @param args
     *            what it prints
     */
    public static void main( String args[] )
    {
        Complex c1 = new Complex( 1, 2 );
        System.out.println( c1 );
        Complex c2 = new Complex( 3, 4 );
        System.out.println( c2 );
        Complex c3 = c1.add( c2 );
        Complex c4 = c1.multiply( c2 );
        Complex c5 = c1.multiply( 10 );
        System.out.println( "(" + c1 + ") + (" + c2 + ") = " + c3 );
        System.out.println( "(" + c1 + ") * (" + c2 + ") = " + c4 );
        System.out.println( "(" + c1 + ") * 10 = " + c5 );
        System.out.println( "abs (" + c2 + ") = " + c2.abs() );
    }
}
