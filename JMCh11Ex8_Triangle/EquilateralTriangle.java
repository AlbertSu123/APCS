/**
 * Calculates the area and the perimeter of an equilateral triangle as specified
 * by the abstract Triangle superclass.
 * 
 * @author Albert Su
 * @version 10/9/17
 * 
 * @author 4
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - Fulk
 */
public class EquilateralTriangle extends AbstractTriangle
{
    /**
     * super
     */
    public EquilateralTriangle()
    {
        super();
    }
    /**
     * The equilateral triangle 
     * @param side one side all are equal
     */

    public EquilateralTriangle( double side )
    {
        super( side );
    }

    /**
     * bc all are equal it can be multiplied by 3
     * @return the side * 3
     */
    public double getPerimeter()
    {
        return this.getSide() * 3;

    }

    /**
     * gets area by multiplying half of one side to the vertical of the other
     *        /|\
     *       / | \
     *      ___|___
     *      @return the area
     */
    public double getArea()
    {
        return Math.sqrt( 3 ) / 4 * this.getSide() * this.getSide();
    }
}
