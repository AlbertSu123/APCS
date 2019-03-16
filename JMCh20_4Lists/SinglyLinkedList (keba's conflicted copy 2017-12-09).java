import java.util.Iterator;

/**
    Implements a singly-linked list.
    
    @author  Albert Su
    @version 12/7/17
    
    @author  Period - 2
    @author  Assignment - JM 20_4
    
    @author  Sources - Maria & Gary Litvin
 */
public class SinglyLinkedList<E> implements Iterable<E>
{
    private ListNode<E> head;
    private int nodeCount;

    // Constructor: creates an empty list
    public SinglyLinkedList()
    {
        head = null;
        nodeCount = 0;
    }

    /**
        Constructor: creates a list that contains all elements from the
        array values, in the same order
        @param values  array containing all elements for this list
     */
    public SinglyLinkedList(E[] values)
    {
        ListNode<E> tail = null;
        for (E value : values) // for each value to insert
        {
            ListNode<E> node = new ListNode<E>(value, null);
            if (head == null)
                head = node;
            else
                tail.setNext(node);
            tail = node;    // update tail
        }

        nodeCount = values.length;
    }

    /**
        Return true if this list is empty; otherwise returns false.
        @return true if this list is empty; otherwise returns false.
     */
    public boolean isEmpty()
    {
        if(nodeCount == 0)
        {
            return true;
        }
        return false;  // fix this
    }

    /**
        Returns the number of elements in this list.
        @return  number of elements in this list.
     */
    public int size()
    {
        return nodeCount;  // fix this
    }

    public boolean contains(Object obj)
    {
        Iterator iterator = this.iterator();
        
        while (iterator.hasNext()){
            if (iterator.next().equals( obj )){
                return true;
            }
        }
        
        return false;  
    }

    /**
        Returns the index of the first Object equal to obj; if not found,
        returns -1.
        @param obj  Object to find
        @return  the index of the first Object in equal to obj; if not found,
                  returns -1.
     */
    public int indexOf(Object obj)
    {
        Iterator iterator = this.iterator();
        int count = 0;
        
        while (iterator.hasNext()){        
            if (iterator.next().equals( obj )){
                return count;
            }
            count++;
        }

        return -1;
    }

    /**
        Adds obj to this collection.  Returns true if successful;
        otherwise returns false.
        
        @param obj  element to add to this collection
        @return  true if successful; otherwise returns false.
     */
    public boolean add(E obj)
    {
        if ( nodeCount == 0 )
        {
            head = new ListNode<E>( obj, null );
            nodeCount++;
            return true;
        }
        
        ListNode<E> node = head;
        
        while ( node.getNext() != null )
        {
            node = node.getNext();
        }
        
        node.setNext( new ListNode<E>( obj, null ) );
        nodeCount++;
        
        return true;
 
    }

    /**
        Removes the first element that is equal to obj, if any.
        Returns true if successful; otherwise returns false.
        @param obj  element to remove
        @return  true if successful; otherwise returns false.
     */
    public boolean remove(E obj)
    {
        try
        {
            this.remove( indexOf( obj ) );
            return true;
        }
        catch ( Exception ex )
        {
            return false;
        }
    }

    /**
        Returns the i-th element.
        @param i  element to get from the list
        @return element at index i
        @throws IndexOutOfBoundsException 
     */
    public E get(int i)
    {
        int x = 0;
        
        for ( E a : this )
            if ( x == i ){
                return a;
            }
            else{
                x++;
            }
        throw new IndexOutOfBoundsException();
    }

    /**
        Replaces the i-th element with obj and returns the old value.
        
        @param i index of element to replace
        @param obj replacement element of element at index i
        @return old value previously located at index i
        @throws IndexOutOfBoundsException 
     */
    public E set(int i, E obj)
    {
        if ( i >= nodeCount || i < 0 )
            throw new IndexOutOfBoundsException();
        
        ListNode<E> h = head;
        
        for ( int c = 0; c < i; c++ ){
            h = h.getNext();
        }

        E value = h.getValue();
        h.setValue( obj );
        h.setNext( h.getNext() );
        
        return value;
    }

    /**
        Inserts obj to become the i-th element. Increments the size
        of the list by one.
        
        @param i  insertion point in list for obj
        @param obj element to insert into list
        @throws IndexOutOfBoundsException 
     */
    public void add(int i, E obj)
    {
        if ( i > nodeCount || i < 0 )
            throw new IndexOutOfBoundsException();
        
        if ( this.size() == 0 )
        {
            head = ( new ListNode<E>( obj, null ) );
            return;
        }

        ListNode<E> h = head;

        for ( int x = 0; x < i; x++ )
        {
            h = h.getNext();
        }

        h.setNext( new ListNode<E>( obj, h.getNext() ) );

        nodeCount++;
    }

    /**
        Removes the i-th element and returns its value.
        Decrements the size of the list by one.
        @param i index of element to remove
        @return element removed from this list
     */
    public E remove(int i)
    {
        if ( i >= nodeCount || i < 0 )
            throw new IndexOutOfBoundsException();
        
        if ( i == 0 )
        {
            nodeCount--;
            E value = head.getValue();
            head.setValue( null );
            return value;
        }
        
        ListNode<E> h = head;
        
        for ( int x = 0; x < i - 1; x++ ){
            h = h.getNext();
        }
        
        E valueOfNext = h.getNext().getValue();
        h.setNext( h.getNext().getNext() );
        nodeCount--;
        
        return valueOfNext;
    }

    /**
        Returns a string representation of this list.
        @return  a string representation of this list.
     */
    public String toString()
    {
        String str = "";
        for ( E e : this )
            str += e.toString() + ", ";
        return str;
    }

    /**
        Returns an iterator for this collection.
        @return  an iterator for this collection.
     */
    public Iterator<E> iterator()
    {
        return new SinglyLinkedListIterator<E>(head);
    }
}