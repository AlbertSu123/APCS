/**
 * Calculates the area and the perimeter of a right triangle as specified by the
 * abstract Triangle superclass.
 * 
 * @author Albert Su
 * @version 10/9/17
 * 
 * @author 4
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources -Fulk
 */
public class RightTriangle extends AbstractTriangle
{
    /**
     * constructor defined
     */
    public RightTriangle()
    {
        super();
    }


    /**
     * The side length gets it
     * 
     * @param side
     *            how long one short side of the triangle ie not *s1rt2
     */
    public RightTriangle( double side )
    {
        super( side );
    }


    /**
     * gets perimeter one side is x*sqrt2 and the others are x(x + x + xsqrt2
     * @return the perimeter x+ x+ xsqrt2
     */
    public double getPerimeter()
    {
        return this.getSide() * 2 + this.getSide() * Math.sqrt( 2 );
        // return (this.getSide() / Math.sqrt( 2 )) * 2 + this.getSide();
    }


    /**
     * gets area by multiplying two sides together then dividing by 2
     * @return the area
     */
    public double getArea()
    {
        return ( this.getSide() * this.getSide() ) / 2;
    }
}
