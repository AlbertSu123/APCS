import java.util.*;

/**
 * Java Methods Chapter 20 Exercises
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period: TODO
 * @author Assignment: JMCh20Exercises
 *
 * @author Sources: TODO List Collaborators
 */
public class JMCh20Exercises<E>
{
    
    private static int count;

    /**
     * Exercise 20.1<br/>
     * 
     * Fill in the blanks in the initialization of node3, node2, node1 and head,
     * so that node1, node2, and node3 form a linked list (in that order)
     * referred to by head.
     * @return head of constructed list
     */
    public ListNode<String> exercise1()
    {
        ListNode<String> node3 = new ListNode<String>( "Node 3", null );
        ListNode<String> node2 = new ListNode<String>( "Node 2", node3 );
        ListNode<String> node1 = new ListNode<String>( "Node 1", node2 );
        ListNode<String> head = node1;
        return head;
    }

    /**
     * Exercise 20.2<br/>
     * 
     * Returns true if the list referred to by head has at least two nodes;
     * otherwise returns false
     * 
     * @param head  list to check for 2 nodes
     * @return true if the list referred to by head has at least two nodes;
     *         otherwise returns false
     */
    public boolean hasTwo( ListNode<E> head )
    {
        ListNode<E> node = head;
        try 
        {
            node.getNext().getNext();
            return true;
        }
        catch (NullPointerException e)
        {
            return false;
        }
        
    }

    /**
     * Exercise 20.3<br/>
     * 
     * Unlinks the first node from the list and returns the head of the new
     * list. The method should throw a NoSuchElementException when the original
     * list is empty.
     * 
     * @param head reference to the first node of the list to unlink
     * @return head of the new list
     */
    public ListNode<E> removeFirst( ListNode<E> head )
    {
        ListNode<E> node = head;
        node.setValue(null);

        return node.getNext();  
    }

    /**
     * Exercise 20.4(a)<br/>
     * 
     * Returns the number of nodes in the list referred to by head using a for
     * loop.
     * 
     * @param head reference to a list
     * @return the number of nodes in the list referred to by head
     */
    public int sizeFor( ListNode<E> head )
    {
        int size =0;
        for (ListNode<E> node = head; node != null; node = node.getNext())
        {
            size++;
        }
        
        return size;
    }

    /**
     * Exercise 20.4(b)<br/>
     * 
     * Returns the number of nodes in the list referred to by head using
     * recursion.
     * 
     * @param head head reference to a list
     * @return the number of nodes in the list referred to by head
     */
    public int sizeRecur( ListNode<E> head )
    {
        int size = 0;
        if ( (head != null) != true )
        {
            return 0;
        }
        else 
        {
            ListNode<E> node = head;
            node = node.getNext();
            size++;
            return size + sizeRecur(node);
        }

    }

    /**
     * Exercise 20.5<br/>
     * 
     * Appends a new node, holding value, at the end of the list and returns a
     * reference to the first node of the modified list.
     * 
     * @param head refers to the first node of a linked list (without a tail)
     * @param value contents of new node appended to the end of the list
     * @return returns a reference to the first node of the modified list
     */
    public ListNode<E> add( ListNode<E> head, E value )
    {
        ListNode<E> endNode = new ListNode<E> (value, null);
        ListNode<E> temp = head;
        if(head != null) 
        {
            while (head.getNext() != null)
            {
                head = head.getNext();
            }
            head.setNext( endNode );
            return temp;
        }
 
        else {
            head = endNode;
            return head;
        }
        
    }

    /**
     * Exercise 20.6<br/>
     * 
     * Fill in the blanks in the method below. This method takes the list
     * referred to by head, builds a new list in which the nodes have the
     * same information but are arranged in reverse order, and returns the
     * head of the new list. The original list remains unchanged. Your
     * solution must use a for loop (not recursion).
     * 
     * @param head  a reference to a list
     * @return a new list in which the nodes have the same information but
     *         are arranged in reverse order
     */
    public ListNode<E> reverseList( ListNode<E> head )
    {
        ListNode<E> node, newNode, newHead = null;
        for(int i = 0; )
        {
            
        }
        
        return null;  //TODO fix return value
    }

    /**
     * Exercise 20.7<br/>
     * 
     * Write a method
     * <pre>    <code>public ListNode concatenateStrings(ListNode head)</code></pre>
     * that takes the list referred to by head, builds a new list, and returns
     * its head. The original list contains strings. The k-th node in the new
     * list should contain the concatenation of all the strings from the
     * original list from the first node up to and including the k-th node.
     * For example, if the original list contains strings "A", "B", "C", the
     * new list should contain strings "A", "AB", "ABC".
     * 
     * @param head  a reference to a list
     * @return the head of a new list as described above
     */
    public ListNode<String> concatenateStrings( ListNode<String> head )
    {
        // TODO complete method
        
        return null;  //TODO fix return value
    }

    /**
     * Exercise 20.8<br/>
     * 
     * Write a method
     * <pre>   <code>public ListNode rotate(ListNode head)</code></pre>
     * that takes a linked list referred to by head, splits off the first node,
     * and appends it at the end of the list. The method should accomplish this
     * solely by rearranging links: do not allocate new nodes or move objects
     * between nodes. The method should return the head of the rotated list.
     * 
     * @param head  a reference to a linked list
     * @return the head of the rotated list
     */
    public ListNode<E> rotate( ListNode<E> head )
    {
        if (head == null)
        {
            return head;
        }
        ListNode<E> last = head;
        ListNode<E> newHead = head.getNext();
        
        while ((last.getNext()) != null)
        {
           last = last.getNext();
        }
        
        last.setNext( head );
        head.setNext( null );
        
        return newHead;
    }

    /**
     * Exercise 20.9<br/>
     * 
     * A list referred to by head contains strings arranged alphabetically
     * in ascending order. Write a method
     * <pre>   <code>public ListNode insertInOrder(ListNode head, String s)</code></pre>
     * that inserts <code>s</code> into the list, preserving the order. If 
     * <code>s</code> is already in the list,it is not inserted. The method
     * should return the head of the updated list.
     * 
     * @param head  reference to a list containing string arranged in 
     *              alphabetical order
     * @param s value to insert into list preserving order
     * @return the head of the updated list
     */
    public ListNode<String> insertInOrder( ListNode<String> head, String s )
    {
        // TODO complete method
        
        return null;  //TODO fix return value
    }

    /**
     * Exercise 20.10<br/>
     * 
     * Write a method
     * <pre>  <code>public ListNode middleNode(ListNode head)</code></pre>
     * that returns a reference to the middle node (or one of the two middle
     * nodes) of a linked list. Design this method using no recursion and only
     * one loop.
     * 
     * @param head  reference to a linked list
     * @return a reference to the middle node (or one of the two middle nodes)
     *         of a linked list
     */
    public ListNode<E> middleNode( ListNode<E> head )
    {
        ListNode<E> node = head , node2 = head;
        int count = 0;
        try
        {
            node.getNext();
            count++;
        }
        catch ( NullPointerException e )
        {
            
        }
        
        for (int i = 0; i < count/2; i++)
        {
            node2.getNext();
        }
        
        return node2;
    }

    private boolean match( String str, String pattern )
    {
        if ( str.length() > pattern.length() )
        {
            return false;
        }

        for ( int i = 0; i < str.length(); i++ )
        {
            if ( pattern.charAt( i ) != '?'
                && str.charAt( i ) != pattern.charAt( i ) )
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Exercise 20.11<br/>
     * 
     * Let us say that a string matches an input pattern (another string)
     * if the pattern is at least as long as the string and for every
     * non-wildcard character in the pattern the string has the same
     * character in the same position. (The wildcard character is'?'.)
     * For example, both "New York" and " New Jersey" match the input
     * pattern "New ???????". Write a method
     * <pre>  <code>public ListNode moveToBack(ListNode head, String pattern)</code></pre>
     * that takes a list of strings referred to by head and moves all the
     * strings that match pattern to the end of the list, preserving their
     * order. Your method must work by rearranging links; do not allocate
     * new nodes or use temporary arrays or lists. The method should return
     * the head of the updated list.
     * 
     * @param head reference to a list of strings
     * @param pattern input pattern - all matching strings are moved to the
     *                end of the list.
     * @return the head of the updated list
     */
    public ListNode<String> moveToBack( ListNode<String> head, String pattern )
    {
        ListNode<String> tail = head;
        while ( tail.getNext() != null )
        {
            tail = tail.getNext();
        }

        ListNode<String> node = head, prev = null, firstMatch = null;

        while ( node != firstMatch && node != tail )
        {
            ListNode<String> next = node.getNext();

            if ( match( node.getValue(), pattern ) )
            {
                if ( prev == null )
                {
                    head = next;
                }
                else
                {
                    prev.setNext( next );
                }
                tail.setNext( node );
                tail = node;
                tail.setNext( null );

                if ( firstMatch == null )
                {
                    firstMatch = node;
                }
            }
            else
            {
                prev = node;
            }

            node = next;
        }
        return head;
    }

    /**
     * Exercise 20.13<br/>
     * 
     * Implement Selection Sort for a linked list with a tail. (Assume that
     * the list holds Comparable objects.) You method should run in O(n<sup>2</sup>) time,
     * where <code>n</code> is the number of nodes in the list.
     * 
     * @param head  reference to a linked list with tail
     * @return sorted list (using Selection Sort)
     */
    public static void sort( ListNode<String> head )
    {
        
    }

    /**
     * Exercise 20.14<br/>
     * 
     * Removes the largest element from the list and returns the head
     * of the modified list.<br/>
     * Precondition: head refers to the first node of a non-empty
     *               doubly-linked list with Integer values.
     * 
     * @param head  reference to the first node of a non-empty doubly-linked
     *              list with Integer values
     * @return 
     * @return head of modified list
     */
    public int length(ListNode2<Integer> head)
    {
        ListNode2<Integer> temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    public static ListNode2<Integer> removeMax( ListNode2<Integer> head )
    {
        
        for ( int i = 0; i < count; i++ )
        {
            if ( pattern.charAt( i ) != '?'
                && str.charAt( i ) != pattern.charAt( i ) )
            {
                return false;
            }
        }
        
        return null;  //TODO fix return value
    }

    private static void swap(ListNode2<Double> node1, ListNode2<Double> node2)
    {
        Double temp = node1.getValue();
        node1.setValue( node2.getValue() );
        node2.setValue( temp );
    }
    
    /**
     * Exercise 20.15<br/>
     * 
     * Write a method
     * <pre>  <code>public void quickSort(ListNode2 fromNode, ListNode2 toNode)</code></pre>
     * that implements the Quicksort algorithm for a given segment of a
     * doubly-linked list. <code>fromNode</code> refers to the first node of
     * the segment, and <code>toNode</code> refers to the last node of the
     * segment. (Assume that the list holds <code>Comparable</code> objects.)
     * The links outside the segment should remain unchanged, and the segment
     * should remain linked at the same place within the list. The method
     * should run in O(<i>n</i> log <i>n</i>) time, where <i>n</i> is the
     * number of nodes in the segment. Do not use any temporary arrays or lists.
     * 
     * @param fromNode  reference to the first node of the segment
     * @param toNode  reference to the last node of the segment
     */
    public static void quickSort( ListNode2<Double> fromNode, ListNode2<Double> toNode )
    {
        // Choose pivot:
        ListNode2<Double> pivotNode = fromNode;
        Double p = pivotNode.getValue();

        // Partition:

        ListNode2<Double> node1 = fromNode;
        ListNode2<Double> node2 = toNode;
        while ( node1 != node2 )
        {
            if ( node1.getValue().compareTo( p ) <= 0 )
                node1 = node1.getNext();
            else if ( node2.getValue().compareTo( p ) >= 0 )
                node2 = node2.getPrevious();
            else
            {
                swap( node1, node2 );
                node1 = node1.getNext();
                if ( node1 != node2 )
                    node2 = node2.getPrevious();
            }
        }

        // Place pivot in its correct position:

        if ( node1.getValue().compareTo( p ) > 0 )
        {
            swap( pivotNode, node1.getPrevious() );
            pivotNode = node1.getPrevious();
        }
        else
        {
            swap( pivotNode, node1 );
            pivotNode = node1;
        }

        // Sort recursively:
        if ( fromNode != pivotNode )
        {
            quickSort( fromNode, pivotNode.getPrevious() );
        }
        if ( toNode != pivotNode )
        {
            quickSort( pivotNode.getNext(), toNode );
        }
    }
    
    // Methods used by main. These methods should not be used
    // to complete the exercises.
    
    public static <E> ListNode2<E> buildList2(E[] values)
    {
        ListNode2<E> head = null;
        ListNode2<E> tail = null;
        for (E value : values) // for each value to insert
        {
            ListNode2<E> node = new ListNode2<E>(value, tail, null);
            if (head == null)
            {
                head = node;
            }
            else
            {
                tail.setNext(node);
            }
            tail = node;    // update tail
        }

        return head;
    }
    
    public static <E> String strList2(ListNode2<E> head)
    {
        String str = "[", separator = "";

        for (ListNode2<E> node = head; node != null; node = node.getNext())
        {
          str += (separator + node.getValue());
          separator = ", ";
        }

        return str + "]";
    }
    
    public static <E> ListNode<E> buildList(E[] values)
    {
        ListNode<E> head = null;
        ListNode<E> tail = null;
        for (E value : values) // for each value to insert
        {
            ListNode<E> node = new ListNode<E>(value, null);
            if (head == null)
            {
                head = node;
            }
            else
            {
                tail.setNext(node);
            }
            tail = node;    // update tail
        }

       return head;
    }
    
    public static <E> String strList(ListNode<E> head)
    {
        String str = "[", separator = "";

        for (ListNode<E> node = head; node != null; node = node.getNext())
        {
          str += (separator + node.getValue());
          separator = ", ";
        }

        return str + "]";
    }
    
    /**
     * Testing method: instantiates a JMCh20Exercises object and then invokes
     * each method.
     * 
     * @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        JMCh20Exercises<String> ex = new JMCh20Exercises<String>();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) 20-1(a) exercise1()" );
            System.out.println( "   (2) 20-2 hasTwo( ListNode<E> head )" );
            System.out.println( "   (3) 20-3 removeFirst( ListNode<E> head )" );
            System.out.println( "   (4) 20-4a sizeFor( ListNode<E> head )" );
            System.out.println( "   (5) 20-4b sizeRecur( ListNode<E> head )" );
            System.out.println( "   (6) 20-5 add( ListNode<E> head, E value )" );
            System.out.println( "   (7) 20-6 reverseList( ListNode<E> head )" );
            System.out.println( "   (8) 20-7 concatenateStrings( ListNode<String> head )" );
            System.out.println( "   (9) 20-8 rotate( ListNode<E> head )" );
            System.out.println( "   (A) 20-9 insertInOrder( ListNode<String> head, String s )" );
            System.out.println( "   (B) 20-10 middleNode( ListNode<E> head )" );
            System.out.println( "   (C) 20-11 moveToBack( ListNode<String> head, String pattern )" ); 
            System.out.println( "   (D) 20-13 sort( ListNode<String> head )" ); 
            System.out.println( "   (E) 20-14 removeMax( ListNode2<Integer> head )" ); 
            System.out.println( "   (F) 20-15 quickSort( ListNode2<Double> fromNode, ListNode2<Double> toNode )" ); 
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        System.out.println(strList(ex.exercise1()));
                        break;
                    case '2':
                        ListNode<String> head2 = null;
                        System.out.print( strList( head2 ) + " = " );
                        System.out.println( ex.hasTwo( head2 ) );

                        head2 = buildList( new String[] { "a" } );
                        System.out.print( strList( head2 ) + " = " );
                        System.out.println( ex.hasTwo( head2 ) );

                        head2 = buildList( new String[] { "a", "b" } );
                        System.out.print( strList( head2 ) + " = " );
                        System.out.println( ex.hasTwo( head2 ) );
                        break;
                    case '3':
                        ListNode<String> head3 = buildList( new String[]{ "a", "b", "c", "d" } );                        
                        System.out.println( strList( head3 ) );
                        System.out.println( strList( ex.removeFirst( head3 ) ) );
                        break;
                    case '4':
                        ListNode<String> head4 = null;
                        System.out.print( strList( head4 ) + " = " );
                        System.out.println( ex.sizeFor( head4 ) );
                        head4 = buildList( new String[] { "a", "b", "c", "d" } );
                        System.out.print( strList( head4 ) + " = " );
                        System.out.println( ex.sizeFor( head4 ) );
                        break;
                    case '5':
                        ListNode<String> head5 = null;
                        System.out.print( strList( head5 ) + " = " );
                        System.out.println( ex.sizeRecur( head5 ) );
                        head5 = buildList(new String[]{ "a", "b", "c", "d", "e" } );                        
                        System.out.print( strList( head5 ) + " = " );
                        System.out.println( ex.sizeRecur( head5 ) );
                        break;
                    case '6':
                        ListNode<String> head6 = null;
                        System.out.println( strList( head6 ) );
                        System.out.println( strList( ex.add( head6, "zebra" ) ) );

                        head6 = buildList( new String[] { "a", "b", "c" } );
                        System.out.println( strList( head6 ) );
                        System.out.println( strList( ex.add( head6, "zebra" ) ) );
                        break;
                    case '7':
                        ListNode<String> head7 = null;
                        System.out.println( "Original: " + strList( head7 ) );
                        ListNode<String> revHead = ex.reverseList( head7 );
                        System.out.println( "Reverse: " + strList( revHead ) );

                        head7 = buildList( new String[] { "a", "b", "c", "d", "e" } );
                        System.out.println( "Original: " + strList( head7 ) );
                        revHead = ex.reverseList( head7 );
                        System.out.println( "Reverse: " + strList( revHead ) );
                        break;
                    case '8':
                        ListNode<String> head8 = null;
                        System.out.println( "Original: " + strList( head8 ) );
                        ListNode<String> concatHead = ex.concatenateStrings( head8 );
                        System.out.println( "Concatenate: " + strList( concatHead ) );

                        head8 = buildList( new String[] { "A", "B", "C" } );
                        System.out.println( "Original: " + strList( head8 ) );
                        concatHead = ex.concatenateStrings( head8 );
                        System.out.println( "Concatenate: "
                            + strList( concatHead ) );
                        break;
                    case '9':
                        ListNode<String> head9 = null;
                        System.out.println( "Original: " + strList( head9 ) );
                        ListNode<String> rotateHead = ex.rotate( head9 );
                        System.out.println( "Rotate: " + strList( rotateHead ) );

                        head9 = buildList( new String[] { "A", "B", "C", "D" } );
                        System.out.println( "Original: " + strList( head9 ) );
                        rotateHead = ex.rotate( head9 );
                        System.out.println( "Rotate: " + strList( rotateHead ) );
                        break;
                    case 'A':
                    case 'a':
                        ListNode<String> headA = null;
                        System.out.println( "Original: " + strList( headA ) );
                        ListNode<String> insHead = ex.insertInOrder( headA, "N" );
                        System.out.println( "insert in order: " + strList( insHead ) );
                        
                        headA = buildList( new String[] { "B", "F", "K", "Q" } );
                        System.out.println( "Original: " + strList( headA ) );
                        insHead = ex.insertInOrder( headA, "A" );
                        System.out.println( "insert in order: " + strList( insHead ) );

                        headA = buildList( new String[] { "B", "F", "K", "Q" } );
                        System.out.println( "Original: " + strList( headA ) );
                        insHead = ex.insertInOrder( headA, "N" );
                        System.out.println( "insert in order: " + strList( insHead ) );
                        
                        headA = buildList( new String[] { "B", "F", "K", "Q" } );
                        System.out.println( "Original: " + strList( headA ) );
                        insHead = ex.insertInOrder( headA, "Y" );
                        System.out.println( "insert in order: " + strList( insHead ) );
                        
                        headA = buildList( new String[] { "B", "F", "K", "Q" } );
                        System.out.println( "Original: " + strList( headA ) );
                        insHead = ex.insertInOrder( headA, "K" );
                        System.out.println( "insert in order: " + strList( insHead ) );
                        break;
                    case 'B':
                    case 'b':
                        ListNode<String> headB = null;
                        System.out.println( "Original: " + strList( headB ) );
                        ListNode<String> midNode = ex.middleNode( headB );
                        System.out.println( "Middle Node: " + strList( midNode ) );
                        
                        headB = buildList( new String[] { "A", "B", "C" } );
                        System.out.println( "Original: " + strList( headB ) );
                        midNode = ex.middleNode( headB );
                        System.out.println( "Middle Node: " + strList( midNode ) );

                        headB = buildList( new String[] { "A", "B", "C", "D" } );
                        System.out.println( "Original: " + strList( headB ) );
                        midNode = ex.middleNode( headB );
                        System.out.println( "Middle Node: " + strList( midNode ) );
                        break;
                    case 'C':
                    case 'c':
                        ListNode<String> headC = buildList( new String[] { "Santa Clara", "San Jose", "San Bruno", "Gilroy" } );
                        System.out.println( "Original: " + strList( headC ) );
                        insHead = ex.moveToBack( headC, "San ?????" );
                        System.out.println( "moveToBack( headC, \"San ?????\" ): " + strList( insHead ) );
                        break;
                    case 'D':
                    case 'd':
                        ListNode<String> headD = buildList( new String[] { "Santa", "bunny", "newt", "apple", "aardvark", "zebra" } );
                        System.out.println( "Original: " + strList( headD ) );
                        sort( headD );
                        System.out.println( "sort: " + strList( headD ) );
                        break;
                    case 'E':
                    case 'e':
                        ListNode2<Integer> headE = buildList2( new Integer[] { 1, 22, 3, 1234, 99 } );
                        System.out.println( "Original: " + strList2( headE ) );
                        ListNode2<Integer> maxHead = removeMax( headE );
                        System.out.println( "removeMax: " + strList2( maxHead ) );
                        break;
                    case 'F':
                    case 'f':
                        ListNode2<Double> headF = buildList2( new Double[] { 101.0, 22.2, 3.22, 1234.0, 99.9 } );
                        ListNode2<Double> tailF = headF.getNext().getNext().getNext().getNext();
                        System.out.println( "Original: " + strList2( headF ) );
                        quickSort( headF, tailF );
                        System.out.println( "quickSort: " + strList2( headF ) );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
