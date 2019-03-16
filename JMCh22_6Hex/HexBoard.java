/**
 * 
 *  This is the hexboard with helper methods
 *
 *  @author  Albert
 *  @version Jan 19, 2018
 *  @author  Period: 2
 *  @author  Assignment: JMCh22_6Hex
 *
 *  @author  Sources: none
 */
public class HexBoard extends CharMatrix
{
    public HexBoard(int rows, int cols)
    {
        super(rows, cols);
    }

    public boolean isBlack(int r, int c)
    {
        if ( charAt( r, c ) == 'b' && isInBounds( r, c ) ) 
        { 
            return true; 
        } 
        return false;
    }

    public boolean isWhite(int r, int c)
    {
        if ( charAt( r, c ) == 'w' && isInBounds( r, c ) ) 
        { 
            return true; 
        } 
        return false;
    }

    public  boolean isGray(int r, int c)
    {
        if ( charAt( r, c ) == 'x' && isInBounds( r, c ) ) 
        { 
            return true; 
        } 
        return false; 
    }

    public void setBlack(int r, int c)
    {
        setCharAt(r, c, 'b');
    }

    public void setWhite(int r, int c)
    {
        setCharAt(r, c, 'w');
    }

    public void setGray(int r, int c)
    {
        setCharAt(r, c, 'x');
    }

    /**
     *  Returns true if there is a contiguous chain of black stones
     *  that starts in col 0 and ends in the last column of the board;
     *  otherwise returns false.
     */
    public boolean blackHasWon()
    {
        int cnt = 0; 
        for ( int i = 0; i < numRows(); i++ ) 
        { 
            areaFill( i, 0 ); 
        } 
        for ( int i = 0; i < numRows(); i++ ) 
        { 
            if ( isGray( i, numCols() - 1 ) ) 
            { 
                cnt++; 
            } 
        } 
        for ( int i = 0; i < numRows(); i++ ) 
        { 
            for ( int k = 0; k < numCols(); k++ ) 
            { 
                if ( isGray( i, k ) ) 
                { 
                    setBlack( i, k ); 
                } 
            } 
        } 
        return cnt > 0; 
    }

    /**
     *  Fills the contiguous area that contains r,c with gray color.
     *  Does nothing if r, c is out of bounds or is not black.
     */
    public void areaFill(int r, int c)
    {
        if ( isInBounds( r, c ) && isBlack( r, c ) ) 
        { 
            setGray( r, c ); 
            areaFill( r - 1, c - 1 ); 
            areaFill( r - 1, c ); 
            areaFill( r, c - 1 ); 
            areaFill( r, c + 1 ); 
            areaFill( r + 1, c ); 
            areaFill( r + 1, c + 1 ); 
        } 
    }

    public String toString()
    {
        String s = "";

        for (int r = 0; r < numRows(); r++)
        {
            for (int c = 0; c < numCols(); c++)
            {
                if (isBlack(r, c))
                    s += 'B';      
                else if (isWhite(r, c))
                    s += 'W';
                else if (isGray(r, c))
                    s += 'X';
                else
                    s += '.';
            }
            s += '\n';
        }
        return s;
    }

    //****************************************************************

    private boolean isInBounds(int row, int col)
    {
        if ( row >= 0 && row < numRows() && col >= 0 && col < numCols() ) 
        { 
            return true; 
        } 
        return false;
    }
}