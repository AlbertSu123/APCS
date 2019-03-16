/**
 * The abstract class <code>Triangle</code> requires methods for calculating the
 * area and the perimeter as specified the type of triangle. A method to
 * calculate the ratio of the area to the perimeter is provided. The class works
 * for equilateral triangles and for right isosceles triangles; which can be
 * specified with the length of a side.
 * 
 * @author Albert Su
 * @version 10/9/17
 * 
 * @author 4
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - Fulk
 */
public abstract class AbstractTriangle
{
    private double side;


    /**
     * Since both have get Area method, it is an abstract method
     * 
     * @return area of triangle
     */
    public abstract double getArea();

    /**
     * Since both have get perimeter method, it is an abstract method
     * 
     * @return perimeter of triangle
     */
    public abstract double getPerimeter();

    /**
     * 
     * Ratio of both are the same(Area/perimeter)
     * @return ratio of area/perimeter
     */
    public double getRatio()
    {
        return getArea() / getPerimeter();
    }

    /**
     * creates one with side 0
     */
    public AbstractTriangle()
    {
        side = 0;
    }

    /**
     * it changes side to the actual sidelength not 0
     * @param sideLength lenght of one side of triangle
     */
    public AbstractTriangle( double sideLength )
    {
        side = sideLength;
    }

    /**
     * 
     * returns side lenght when called
     * @return side
     */
    public double getSide()
    {
        return side;
    }

}
