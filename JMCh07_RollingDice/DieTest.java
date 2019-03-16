/**
 * 
 *  main method
 * tests the die
 *
 *  @author  asu995
 *  @version Sep 12, 2017
 *  @author  Period: 1
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources:Fulk
 */
public class DieTest
{
    /**
     * 
     * main method
     * @param args tests the lab
     */
    public static void main(String[] args)
    {
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
        System.out.println(die.getNumDots());
        die.roll();
    }
}
