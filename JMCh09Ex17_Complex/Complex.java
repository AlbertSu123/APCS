/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author Albert Su
 * @version 10/1/2017
 * @author Period: 2
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: Fulk
 */
public class Complex
{
    private double a;

    private double b;


    /**
     * 
     * @param a
     *            first double
     * @param b
     *            second double
     */
    public Complex( double a, double b )
    {
        this.a = a;
        this.b = b;
    }


    /**
     * 
     * @param a
     *            first double
     */
    public Complex( double a )
    {
        this( a, 0.0 );
    }


    /**
     * 
     * uses formula sqrt(a^2 +b^2)
     * 
     * @return abs value of a + b
     */

    public double abs()
    {
        return Math.sqrt( ( a * a ) + ( b * b ) );

    }


    /**
     * 
     * adds two complex numbers together
     * 
     * @param other
     *            different complex number
     * @return the sum of the two complex numbers
     */
    public Complex add( Complex other )
    {
        double temp1 = other.a + a;
        double temp2 = other.b + b;
        Complex addition = new Complex( temp1, temp2 );
        return addition;
    }


    /**
     * 
     * converts it to double tyoe so J unit can test
     * 
     * @param dubs
     *            the double value of addition so it converts
     * @return the double
     */
    public Complex add( double dubs )
    {
        double temp1 = a + dubs;
        return new Complex( temp1, b );
    }


    /**
     * 
     * multiplies two complex numbers together
     * 
     * @param other
     *            different value of a and b
     * @return the value of the two complex numbers multiplied
     */
    public Complex multiply( Complex other )
    {
        double c = a * other.a - b * other.b;
        double d = b * other.a + a * other.b;

        return new Complex( c, d );
    }


    /**
     * 
     * Converts to double so J unit can test
     * 
     * @param dubs
     *            temp holder that is double so it converts to double
     * @return the value of the multiplied numbers
     */
    public Complex multiply( double dubs )
    {
        double c = a * dubs;
        double d = b * dubs;

        return new Complex( c, d );
    }


    public String toString()
    {
        return a + " + " + b + "i";
    }
}
