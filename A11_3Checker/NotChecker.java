/*** Part (c) ***/
/**
 * 
 *  Not checker returns true if checker accepts false if not
 *
 *  @author  Albert
 *  @version Oct 20, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_3Checker
 *
 *  @author  Sources: None
 */
public class NotChecker implements Checker
{
    private Checker check;


    /**
     * @param a
     *            a Checker
     */
    public NotChecker( Checker a )
    {
        check = a;
    }


    /**
     * @param text
     *            a string to consider for acceptance
     * @return true if this Checker accepts text; false otherwise
     */
    public boolean accept( String text )
    {
        return !check.accept( text );
    }
}
