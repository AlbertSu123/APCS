import java.awt.*;
import javax.swing.*;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 *          Period - TODO Your Period Assignment - A12.6 - ParallelLines
 * 
 *          Sources - TODO list collaborators
 */
public class ParallelLines extends JPanel
{
    private int x = 0;

    private int xLine = 0;

    private int yLine = 0;

    private int offSet = 0;


    // TODO Your Instance Variables Here
    /**
     * this is the paintcomponets that gets the width and height
     * @param g this is the graphics
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * Draws the boxes
     * 
     * @param g g
     * @param width wotjd
     * @param height how tall it is
     */
    public void drawIllusion( Graphics g, int width, int height )
    {
        for ( int row = 0; row < 10; row++ )
        {

            g.drawLine( xLine, yLine + offSet, 700, 0 + offSet );
            offSet = offSet + 40;
            // calculate the start of the row of squares
            // calculate and add a horizontal offset

            for ( int col = 0; col < 8; col++ )
            {

                int y = 40;
                int z = 40;
                g.fillRect( x, z - 40, y, y );
                g.fillRect( x + 20, z, y, y );
                g.fillRect( x + 40, z * 2, y, y );
                g.fillRect( x + 20, z * 3, y, y );
                g.fillRect( x, z * 4, y, y );
                g.fillRect( x + 20, z * 5, y, y );
                g.fillRect( x + 40, z * 6, y, y );
                g.fillRect( x + 20, z * 7, y, y );
                g.fillRect( x + 0, z * 8, y, y );
                z = z + 80;
                x = x + 80;
                // draw the square
                // calculate and position for the next square
            }

            // calculate the location and draw the line
        }

        // calculate the location and draw the line
    }

    /**
     * 
     * is main method
     * @param args dose the scren sizing
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
