import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Coins: This class accepts a certain amount of monetary change (in cents).
 * The output is a list of the number of quarters, dimes, nickels, and
 * pennies that will make that amount of change with the least number of
 * coins possible.
 *
 * @author Albert
 * @version 8/31/17
 * @author Period: 2
 * 
 * @author Assignment: Lab Activity 3.2 - Coins
 * 
 * @author Sources: Fulk
 */
public class Coins
{
    private int myChange;
//    private int quarter;
//    private int dime;
//    private int nickel;
//    private int penny;
//    private int quarters;
//    private int dimes;
//    private int nickels;
//    private int pennies;
/**
 * How many cents in change
 * @param change gives number
 */
    public Coins( int change )
    {
        myChange = change;
    }
/**
 * Calculates amount of change
 * divides and multipies and subtracts
 */
    public void calculate()
    {
        int quarter;
        int dime;
        int nickel;
        int penny;
        quarter = myChange / 25;
        myChange = myChange - (quarter * 25);
        dime = myChange / 10;
        myChange = myChange - (dime * 10);
        nickel = myChange / 5;
        myChange = myChange - (nickel * 5);
        penny = myChange / 1;
        myChange = myChange - (penny * 1);
        
        System.out.println( myChange + " cents =>" );
        System.out.println("quarter(s)    " + quarter);
        System.out.println("dime(s)       " + dime);
        System.out.println("nickel(s)     " + nickel);
        System.out.println("penny(s)      " + penny);
        
    }
    
    /**
     * Intended only for debugging.
     * 
     * <p>A generic toString implementation that uses reflection to print
     * names and values of all fields <em>declared in this class</em>.
     * Note that superclass fields are left out of this implementation.</p>
     * 
     * @return a string representation of this Easter.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getType().getName() + " "
                    + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }
            separator = ", ";
        }
        return str + "]";
    }

    /**
     * Tester for the Coins class.
     * @param args command line arguments - not used
     */
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );

        System.out.print( "Please enter the number of cents --> " );
        int cents = console.nextInt();
        
        Coins change = new Coins( cents );
        change.calculate();
        System.out.println("");
    }
}
