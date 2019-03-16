import java.util.List;
import java.util.Stack;

public class BrowserModel
{
    private BrowserView view;
    private Stack<Integer> backStk, forwardStk;
    private int topLine;

    public BrowserModel(BrowserView v)
    {
        backStk = new Stack<Integer>();
        forwardStk = new Stack<Integer>();
        v.update( 0 );
        view = v;
        
    }
    
    public void back()
    {
        int n = new Integer (topLine);
        forwardStk.push( n );
        System.out.println( "backA:"+ topLine);
        if (hasBack())
        {
            int num = backStk.pop().intValue();
            topLine = num;
            
        }
        view.update( topLine );
        System.out.println( "backB:"+ topLine);
    }
    public void forward()
    {
        int n = new Integer (topLine);
        backStk.push( n );
        if(hasForward())
        {
            int num = forwardStk.pop().intValue();
            topLine = num;
            view.update( topLine );
        }
        
        
    }
    public void home()
    {
        int n = new Integer (topLine);
        backStk.push(n);
        topLine = n;
        view.update( topLine );
        forwardStk.removeAllElements();
    }
    public void followLink(int n)
    {
        
    }
    public boolean hasBack()
    {
        return !forwardStk.isEmpty();
        
    }
    public boolean hasForward()
    {
        return !backStk.isEmpty();
        
    }


    // The following are for test purposes only
    public Stack<Integer> getBackStk()
    {
        return backStk;
    }

    public Stack<Integer> getForwardStk()
    {
        return forwardStk;
    }

    public int getTopLine()
    {
        return topLine;
    }
}

