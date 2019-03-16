/**
 * A class to solve various loop problems
 * 
 * @author Albert Su
 * @version 9/18/17
 * 
 *          Period - 2 Assignment - A12.1 - FunLoops
 * 
 *          Sources - Peck
 */
public class FunLoops
{
    /**
     * 
     * does the m agic square
     * @param n the number prints
     */
    public void magicsquare( int n )
    {
        System.out.println( "Magic Squares" );
        int y = 1;
        int c = 1;
        long x = 0;
        while ( c <= n )
        {
            x = x + y;
            if ( Math.sqrt( x ) == (int)( Math.sqrt( x ) ) )
            {
                System.out.println( c + ": " + x );
                c++;
            }
            y++;
        }
    }

            
        
    

    // Fix this

    /**
     * 
     * main method
     * @param args what it prints
     */
    public static void main( String[] args )
    {
        FunLoops fun = new FunLoops();

        fun.magicsquare( 4 );
        System.out.println();

        System.out.println( "LCM (15, 18) = " + fun.lcm( 15, 18 ) );
        System.out.println( "LCM (40, 12) = " + fun.lcm( 40, 12 ) );
        System.out.println( "LCM (2, 7) = " + fun.lcm( 2, 7 ) );
        System.out.println( "LCM (100, 5) = " + fun.lcm( 100, 5 ) );
        System.out.println();

        fun.magicsquare( 10 );
    }

    /**
     * 
     * does lcm
     * @param i first number
     * @param j second number
     * @return lcm
     */
    public int lcm( int i, int j )
    {
        int lcm = 0;
        for ( int x1 = 1; x1 <= i || x1 <= j; x1++ )
        {
            if ( i % x1 == 0 && j % x1 == 0 )
            {
                lcm = ( i * j ) / x1;
            }
        }
        return lcm; 
    }
}
