/**
   Implements a sorted list of words

   @author  Albert Su
   @version 11/22/2017

   @author Period - 2
   @author Assignment - Java Methods 13.4 Lab: Keeping Things in Order

   @author Sources - fulk
 */
public class SortedWordList extends java.util.ArrayList<String>
{
    /**
     * Sorted list
     */
    public SortedWordList()
    {
        super();
    }


    /**
     * @param i
     *            Initial capacity
     */
    public SortedWordList( int capacity )
    {
        super( capacity );
    }


    public int indexOf( String target )
    {
        int low = 0;
        int high = this.size() - 1;
        int middle;

        while ( low <= high )
        {

            middle = ( low + high ) / 2;

            int diff = target.compareToIgnoreCase( this.get( middle ) );

            if ( diff > 0 )
            {
                low = middle + 1;
            }
            else if ( diff < 0 )
            {
                high = middle - 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }


    public boolean contains( String a )
    {
        if ( indexOf( a ) == -1 )
        {
            return false;
        }
        return true;
    }


    public String set( int i, String word )
    {
        String w;
        if ( i == 0 && word.compareTo( this.get( i + 1 ) ) < 0 && !word.equals( this.get( i + 1 ) ) )
        {
            w = super.set( i, word );
        }
        else if ( word.compareTo( this.get( i - 1 ) ) > 0 && word.compareTo( this.get( i + 1 ) ) < 0
            && !word.equals( this.get( i + 1 ) ) && !word.equals( this.get( i - 1 ) ) )
        {
            w = super.set( i, word );
        }
        else
            throw new IllegalArgumentException( "word =" + word + " i =" + i );
        return w;
    }


    public boolean add( String a )
    {
        if ( this.contains( a ) )
        {
            return false;
        }

        int low = 0;
        int high = this.size() - 1;
        int middle;
        
        while ( low <= high )
        {

            middle = ( low + high ) / 2;

            int subtract = a.compareTo( this.get( middle ) );
            if ( subtract > 0 )
            {
                low = middle + 1;
            }
            else if ( subtract < 0 )
            {
                high = middle - 1;
            }
        }
        super.add( high + 1, a );
        return true;
    }


    public void merge( SortedWordList a )
    {
        for ( String x : a )
        {
            add( x );
        }
    }
}