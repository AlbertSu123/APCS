import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;

/**
 * gets perimeter and area of any polygon
 * draws it as well
 *
 * @author  Albert Su
 * @version 10/31/17
 *
 * @author  Period - 2
 * @author  Assignment - Irregular Polygon
 * 
 * @author  Sources - Fulk
 */
public class IrregularPolygon
{
    private DrawingTool pen; 
    private ArrayList<Point2D.Double> myPolygon;

    //constuctors
    
    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
    }

    // public methods
    /**
     * 
     * adds points to the polygon
     * @param aPoint where a point is
     */
    public void add( Point2D.Double aPoint )
    {
        myPolygon.add( aPoint );
    }
    /**
     * 
     * calculates the distance between 2 points using the distance formula
     * @param p1 point 1
     * @param p2 point 2
     * @return the distance between the two points
     */
    private double distance( Point2D.Double p1, Point2D.Double p2 )
    {
        return Math.sqrt( Math.pow( ( p2.x - p1.x ), 2 )
            + Math.pow( ( p2.y - p1.y ), 2 ) );
    }

    /**
     * 
     * Gets the perimeter of the polygon using the 
     * distance method
     * @return
     */
    public double perimeter()
    {
        if ( myPolygon.size() < 3 )
        {
            return 0;
        }
        
        double perimeter = 0;
        
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            perimeter += distance( myPolygon.get( i ), myPolygon.get( i + 1 ) );
        }
        
        perimeter += distance( myPolygon.get( myPolygon.size() - 1 ), myPolygon.get( 0 ) );
        
        return perimeter;
    }

    /**
     * Calculates are by using the weird method from the lab
     * @return area
     */
    public double area()
    {
        if ( myPolygon.size() < 3 )
        {
            return 0;
        }
        
        double area = 0;
        
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            area += myPolygon.get( i ).x * myPolygon.get( i + 1 ).y;
        }
        
        area += myPolygon.get( myPolygon.size() - 1 ).x * myPolygon.get( 0 ).y;
        
        for ( int i = 0; i < myPolygon.size() - 1; i++ )
        {
            area -= myPolygon.get( i ).y * myPolygon.get( i + 1 ).x;
        }
        
        area -= myPolygon.get( myPolygon.size() - 1 ).y * myPolygon.get( 0 ).x;
        
        area = Math.abs( area / 2 );
        
        return area;
    }

    /**
     * draws the polygon
     *
     */
    public void draw()
    {
        if ( myPolygon.size() < 3 )
        {
            return;
        }
        
        pen.up();
        pen.move( myPolygon.get( 0 ).getX(), myPolygon.get( 0 ).getY() );
        pen.down();
        
        for ( int i = 1; i < myPolygon.size(); i++ )
        {
            pen.move( myPolygon.get( i ).getX(), myPolygon.get( i ).getY() );
        }
        
        pen.move( myPolygon.get( 0 ).getX(), myPolygon.get( 0 ).getY() );
    }
}