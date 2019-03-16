import java.util.Stack;

/**
 *  This is a browser model.
 *
 *  @author  Albert Su
 *  @version Jan 16, 2017
 *  @author  Period: 2
 *  @author  Assignment: JMCh21_3Browsing
 *
 *  @author  Sources: none
 */
public class BrowserModel
{
    private BrowserView view;

    private Stack<Integer> backStk;
    private Stack<Integer> forwardStk;

    private int topLine;


    /**
     * The constructor
     *
     * 
     *            the browser view
     */
    /**
     * 
     * @param v the BrowserView
     */
    public BrowserModel( BrowserView v )
    {
        backStk = new Stack<Integer>();
        forwardStk = new Stack<Integer>();
        view = v;
        view.update( 0 );
    }


    /**
     * This follows a link.
     *
     * @param n
     *            it goes to the link
     */
    public void followLink( int n )
    {
        Integer num = new Integer( topLine );
        backStk.push( num );

        topLine = n;
        view.update( topLine );
        forwardStk.removeAllElements();

    }


    /**
     * Checks for back
     *
     * @return boolean whether it's empty or not
     */
    public boolean hasBack()
    {
        return !backStk.empty();
        
    }


    /**
     * Checks for forward
     *
     * @return boolean stk
     */
    public boolean hasForward()
    {
        return !forwardStk.empty();
    }


    /**
     * Goes home
     * 
     * returns void
     */
    public void home()
    {
        Integer num = new Integer( topLine );
        backStk.push( num );

        topLine = 0;
        view.update( topLine );
        forwardStk.removeAllElements();

    }


    /**
     * Goes back
     * 
     * returns void
     */
    public void back()
    {
        Integer n = new Integer( topLine );
        forwardStk.push( n );

        System.out.println( "backA: " + topLine );
        if ( hasBack() )
        {

            int num = backStk.pop().intValue();
            topLine = num;
        }
        view.update( topLine );
        System.out.println( "backB: " + topLine );
    }


    /**
     * Goes forward returns void
     */
    public void forward()
    {

        Integer n = new Integer( topLine );
        backStk.push( n );
        if ( hasForward() )
        {

            int num = forwardStk.pop().intValue();
            topLine = num;
            view.update( topLine );
        }
    }


    // The following are for test purposes only
    /**
     * get back
     * @return Stack<Integer>
     */
    public Stack<Integer> getBackStk()
    {
        return backStk;
    }

    /**
     * Get the forward
     * @return Stack<Integer>
     */
    public Stack<Integer> getForwardStk()
    {
        return forwardStk;
    }

    
    /**
     * get the topline
     * @return int topLine
     */
    public int getTopLine()
    {
        return topLine;
    }
}