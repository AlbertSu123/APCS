import java.lang.reflect.*;

/**
   This class implements a vendor that sells one kind of item.
   A vendor carries out sales transactions.

   @author  Albert Su
   @version 9/27/17

   @author Period - 2
   @author Assignment - Java Methods Ch09 - SnackBar

   @author Sources - Fulk
 */
/**
 */
public class Vendor
{
    /**
     * test
     */
    public int totalCents;
    public int stock;
    private int centsPrice;
    private int centsChange;
    public static double totalSales;

    //  Constructor
    //  Parameters:
    //    int price of a single item in cents
    //    int number of items to place in stock
    /**
     * 
     * @param Price how much it costs
     * @param numStock number in stock(enough)
     */
    public Vendor (int Price, int numStock)
    {
        centsPrice = Price;
        stock = numStock;
    }

    //  Sets the quantity of items in stock.
    //  Parameters:
    //    int number of items to place in stock
    //  Return:
    //    None
    /**
     * 
     * sets Stock to numStock
     * @param numStock number in stock
     */
    public void setStock(int numStock)
    {
        stock = numStock;
    }

    //  Returns the number of items currently in stock.
    //  Parameters:
    //    None
    //  Return:
    //    int number of items currently in stock
    /**
     * 
     * gets the number of stock currently
     * @return stock this is numStock
     */
    public int getStock()
    {
        return stock;
    }

    //  Adds a specified amount (in cents) to the deposited amount.
    //  Parameters:
    //    int number of cents to add to the deposit
    //  Return:
    //    None
    /**
     * 
     * adds right amount of money if there still is stock
     * else do nothing
     * @param centsadd how much money put in
     */
    public void addMoney(int centsadd)
    {
        if (stock >= 1)
        {
            totalCents += centsadd;
        }
        else
        {
            return;
        }
        
    }

    //  Returns the currently deposited amount (in cents).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current deposit
    /**
     * 
     * gets total cents
     * @return totalCents
     */
    public int getDeposit()
    {
        return totalCents;
    }

    //  Implements a sale.  If there are items in stock and
    //  the deposited amount is greater than or equal to
    //  the single item price, then adjusts the stock
    //  and calculates and sets change and returns true;
    //  otherwise refunds the whole deposit (moves it into change)
    //  and returns false.
    //  Parameters:
    //    None
    //  Return:
    //    boolean successful sale (true) or failure (false)
    /**
     * 
     * makes sales if everything is right
     * @return true or false depending if sale went through or not
     */
    public boolean makeSale()
    {
        if ((stock > 0) && (totalCents >= centsPrice))
        {
            stock--;
            centsChange = totalCents - centsPrice;
            totalCents = 0;
            totalSales += centsPrice/100.0;
            return true;
            
        }
        else
        {
            centsChange = totalCents;
            totalCents = 0;
            return false;
        }
        
    }

    //  Returns and zeroes out the amount of change (from the last
    //  sale or refund).
    //  Parameters:
    //    None
    //  Return:
    //    int number of cents in the current change
    /**
     * 
     * gets how much change which depends on makeSale
     * @return localCentsChange how much change
     */
    public int getChange()
    {
        int localCentsChange = centsChange;
        centsChange = 0;
        return localCentsChange;
    }
    /**
     * 
     * total amount of sales, static
     * @return tempTotalSales
     */
    public static double getTotalSales()
    {
        double tempTotalSales = totalSales;
        totalSales = 0;
        return tempTotalSales;
        
    }
    /**
        Intended only for debugging.
        
        <p>A generic toString implementation that uses reflection to print
        names and values of all fields <em>declared in this class</em>.
        Note that superclass fields are left out of this implementation.</p>
        
        @return  a string representation of this Vendor.
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
                str += separator + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }
}
