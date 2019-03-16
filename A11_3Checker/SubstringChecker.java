/*** TODO Part (a) ***/
// TODO complete documentation
/**
 * 
 *  Substring checker implements check
 *  er ans is used to check if checker a
 *  ccepts text
 *
 *  @author  Albert
 *  @version Oct 20, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_3Checker
 *
 *  @author  Sources: none
 */
public class SubstringChecker implements Checker
{
    private String text;


    /**
     * @param text
     *            a text to check
     */
    public SubstringChecker( String text )
    {
        this.text = text;
    }


    /**
     * @param str
     *            a string to consider for acceptance
     * @return true if this Checker accepts text; false otherwise
     */
    public boolean accept( String str )
    {
        return str.indexOf( text ) != -1;

    }

}
