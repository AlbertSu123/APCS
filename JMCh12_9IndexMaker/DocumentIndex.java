import java.util.ArrayList;
/**
 * 
 * Puts items into list in alphabetical order
 *
 *  @author  Albert
 *  @version Nov 3, 2017
 *  @author  Period: 2
 *  @author  Assignment: JMCh12_9IndexMaker
 *
 *  @author  Sources: Fulk
 */
public class DocumentIndex extends ArrayList<IndexEntry>
{

    //  Creates an empty DocumentIndex with the default
    // initial capacity.
    public DocumentIndex()
    {
        super();
    }

    //  Creates an empty DocumentIndex with a given
    //  initial capacity.
    public DocumentIndex(int initialCapacity)
    {
        super(initialCapacity);
    }

    //  If word is not yet in this DocumentIndex,
    //  creates a new IndexEntry for word, and inserts
    //  it into this list in alphabetical order;
    //  adds num to this word's IndexEntry by calling
    //  its add(num) method.
    public void addWord(String word, int num)
    {
         get(foundOrInserted( word )).add(num);
    }

    //  For each word in str, calls addWord(word, num).
    public void addAllWords(String str, int num)
    {
        String[] words = str.split( "\\W+" );
        
        for ( String s : words )
        {
            if ( s.length() != 0 )
            {
                addWord( s, num );
            }
        }
    }

    // Tries to find an EndexEntry with a given word in this
    // DocumentIndex.  If not found, inserts a new EndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry
    private int foundOrInserted(String word)
    {
        int index;
        int num;
        for ( index = 0; index < size(); index++ )
        {
            String s = get( index ).getWord();
            num = s.compareToIgnoreCase( word );
            
            if ( num == 0 )
            {
                return index;
            }
            
            else if ( num > 0 )
            {
                break;
            }
        }
        add( index, new IndexEntry( word ) );
        
        return index;
    }
}