import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import java.awt.Color;

/**
 *  erases "objects" groups of blocks touching each other
 *  when the mouse is clicked in that area
 *  
 *
 *  @author  Albert Su
 *  @version 11/11/2017
 *  @author Period: 2
 *  @author Assignment: AB24_1EraseObject_GridWorld
 *
 *  @author Sources: Fulk
 */
public class EraseObject extends World<Tile>
{
    private static final Color IMGOBJ_COLOR = Color.BLACK;
    private static final Color ERASE_COLOR = Color.WHITE;
    
    /**
     * Constructs a default 20x20 grid containing black tiles
     * at the locations given in the file "digital.txt".
     */
    public EraseObject()
    {
        this( new BoundedGrid<Tile>( 20, 20 ), "digital.txt" );
    }

    /**
     * Constructs an EraseObject World with the provided grid. Populates
     * the world with black tile objects at the locations given in the 
     * specified file (fName).
     * 
     * @param bg    bounded grid used by this World
     * @param fName name of file containing location information for
     *               tile placement in this World
     */
    public EraseObject( BoundedGrid<Tile> bg, String fName )
    {
        setGrid( bg );
        getData( fName );

        setMessage( "Click on the object to be erased" );
    }

    /**
     * Overrides <code>info.gridworld.world.World&lt;Tile&lt;.locationClicked</code>
     * This method is called when the user clicks on a location in the WorldFrame.
     * Invokes the recursive erase procedure on the clicked location.
     * 
     * @param loc the grid location that the user selected
     * @return true - the world consumes the click
     */
    public boolean locationClicked( Location loc )
    {
        Grid<Tile> gr = getGrid();

        setMessage( "Tile clicked at " + loc );
        erase( gr, loc.getRow(), loc.getCol() );

        return true;
    }

    /**
     *  Loads the data from the specified file containing tile locations
     *  into the this grid.
     *  
     *  The first entry in the provided text file is the number of pairs
     *  that follow (i.e., 55). Each subsequent line contains a pair of
     *  integers, separated by a blank space. Each pair is a row and column
     *  coordinate that specifies the location of a black tile in the
     *  starting grid.
     *  
     *  @param fName name of file containing tile locations
     */
    private void getData( String fName )
    {
        File file = new File(fName);
        Scanner scan = null;
        try
        {
            scan = new Scanner(file);
        }
        catch ( FileNotFoundException e )
        {
            System.out.print( "***Cannot open " + fName + " ***"  );
            // TODO Auto-generated catch block
            System.exit(1);
        }
        scan.nextInt();
        while (scan.hasNextInt())
        {
            int row = scan.nextInt();
            int col = scan.nextInt();
            Location loc = new Location(row, col);
            Tile tile = new Tile(IMGOBJ_COLOR);
            this.add( loc, tile );
        }
    }

    /**
     * Recursively changes the color of a series of adjacent tiles (erases)
     * starting at the given coordinates if this coordinate is part of
     * the object. The method should erase the entire object (remove black).
     *
     * @param gr     grid containing sequences of adjacent tiles
     * @param row    row coordinate to begin erasure
     * @param col    column coordinate to begin erasure
     */
    private void erase( Grid<Tile> gr, int row, int col )
    {
        Location loc = new Location( row, col );
        Tile t = gr.get( loc );

        if ( t != null && t.getColor().equals( IMGOBJ_COLOR ) )
        {
            gr.put( new Location( row, col ), new Tile( ERASE_COLOR ) );
            if ( row == 0 || row == gr.getNumRows() - 1 || col == 0 || col == gr.getNumCols() - 1 )
            {
                new World<Tile>( gr ).show();
            }
            else
            {
                erase( gr, row, col + 1 );
                erase( gr, row, col - 1 );
                erase( gr, row + 1, col );
                erase( gr, row - 1, col );  
            }
        }
    }
    

    public static void main( String[] args )
    {
        new EraseObject().show();
    }
}
