/**
 *  Simulates a six-sided die.
 *
 *  @author  TODO your Name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources: TODO collaborators
 */
public class Die
{
    /**
     * This is an int for the number of dots
     * 
     */
    public int numDots;

    /**
     * Sets numDots to a random integer from 1 to 6
     */
    /**
     * 
     * TODO Write your method description here.
     */
    public void roll()
    {
        numDots = (int)(1 + Math.random() * 6 );
    }
    
    /**
     * Returns the value of the most recent roll.
     * @return numDots
     */
    public int getNumDots()
    {
        return numDots; // Fix this !!!
    }
}
