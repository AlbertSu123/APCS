/*** Part (b) ***/
// TODO complete documentation
/**
 * 
 * If both are the good, then returns true, else return false
 *
 * @author Albert
 * @version Oct 20, 2017
 * @author Period: 2
 * @author Assignment: A11_3Checker
 *
 * @author Sources: none
 */
public class AndChecker implements Checker
{
    private Checker checker1;

    private Checker checker2;


    /**
     * This is public
     * 
     * @param a
     *            checker a
     * @param b
     *            checker b
     */
    public AndChecker( Checker a, Checker b )
    {
        checker1 = a;
        checker2 = b;
    }


    /**
     * This checks if the string is good or not
     * returns true or false
     * @param text this is the string it checks
     * @return either true or false based on whether both
     * tests work
     */
    public boolean accept( String text )
    {
        if ( ( checker1.accept( text ) == checker2.accept( text ) ) 
                        && checker1.accept( text ) )
        {
            return true;
        }
        return false;
    }

}
