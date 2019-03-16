/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what
 *       abstraction it represents, and how to use it.
 *
 *  @author  TODO your name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh03Ex11_Book
 *
 *  @author  Sources: TODO list collaborators
 */
public class Book
{
    private int numPages;
    public int currentPage;
    
    public Book (int sum)
    {
        numPages = sum;
        currentPage = 1;
        
    }
    public int getCurrentPage()
    {
        return currentPage;
    }
    public int getNumPages()
    {
        return numPages;
    }
    public void nextPage()
    {
        if (currentPage < numPages) 
        {
            currentPage++;
        }
    }
}
