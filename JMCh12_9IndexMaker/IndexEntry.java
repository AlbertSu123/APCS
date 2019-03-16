import java.util.ArrayList;

/**
 * 
 * Index Entry has various features explained below
 *
 *  @author  Albert
 *  @version Nov 3, 2017
 *  @author  Period: 2
 *  @author  Assignment: JMCh12_9IndexMaker
 *
 *  @author  Sources: Fulk
 */
public class IndexEntry
{
    private String word;

    private ArrayList<Integer> numsList;
    // TODO instance fields


    // Constructs an IndexEntry for a given word
    // (converted to upper case); sets numsList
    // to an empty ArrayList.
    public IndexEntry( String word )
    {
        this.word = word.toUpperCase();
        numsList = new ArrayList<Integer>();
    }


    // Returns the word of this IndexEntry object.
    public String getWord()
    {
        return word; // Fix this!!
    }


    // If num is not already in the list, adds num
    // at the end of this IndexEntry's list
    // of numbers.
    public void add( int num )
    {
        if ( !numsList.contains( num ) )
        {
            numsList.add( num );
        }
    }


    // Converts this IndexEntry into a string in the
    // following format: the word followed by a space, followed by
    // numbers separated by a comma and a space.
    public String toString()
    {
        String string = word;

        for ( Integer number : numsList )
        {
            string = string + " " + number.toString() + ",";
        }

        string = string.substring( 0, string.length() - 1 );

        return string;
    }
}
