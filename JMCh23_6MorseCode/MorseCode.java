import java.util.TreeMap;

/**
   This lab uses trees to store data. We can change things from morse code to non morse code.
   @author  Albert Su
   @version 1/31/17
   @author Period -2
   @author Assignment - MorseCode
   @author Sources - none
 */
public class MorseCode
{
    private static final char DOT = '.';
    private static final char DASH = '-';

    private static TreeMap<Character, String> codeMap;
    private static TreeNode<Character> decodeTree;

    public static void start()
    {
        codeMap = new TreeMap<Character, String>();

        // put a space in the root of the decoding tree
        decodeTree = new TreeNode<Character>(' ', null, null);  // autoboxing

        addSymbol('A', ".-");
        addSymbol('B', "-...");
        addSymbol('C', "-.-.");
        addSymbol('D', "-..");
        addSymbol('E', ".");
        addSymbol('F', "..-.");
        addSymbol('G', "--.");
        addSymbol('H', "....");
        addSymbol('I', "..");
        addSymbol('J', ".---");
        addSymbol('K', "-.-");
        addSymbol('L', ".-..");
        addSymbol('M', "--");
        addSymbol('N', "-.");
        addSymbol('O', "---");
        addSymbol('P', ".--.");
        addSymbol('Q', "--.-");
        addSymbol('R', ".-.");
        addSymbol('S', "...");
        addSymbol('T', "-");
        addSymbol('U', "..-");
        addSymbol('V', "...-");
        addSymbol('W', ".--");
        addSymbol('X', "-..-");
        addSymbol('Y', "-.--");
        addSymbol('Z', "--..");
        addSymbol('0', "-----");
        addSymbol('1', ".----");
        addSymbol('2', "..---");
        addSymbol('3', "...--");
        addSymbol('4', "....-");
        addSymbol('5', ".....");
        addSymbol('6', "-....");
        addSymbol('7', "--...");
        addSymbol('8', "---..");
        addSymbol('9', "----.");
        addSymbol('.', ".-.-.-");
        addSymbol(',', "--..--");
        addSymbol('?', "..--..");
    }

    /**
     *  Inserts letter from codemap and another into the tree
     */
    private static void addSymbol(char letter, String code)
    {
        codeMap.put( letter, code );
        treeInsert(letter, code);
    }

    /**
     *  Node at end of path is the letter
     */
    private static void treeInsert(char letter, String code)
    {
        TreeNode<Character> head = decodeTree;
        char[] codeArray = code.toCharArray();
        for ( char c : codeArray )
        {
            if ( c == DOT )
            {
                if ( head.getLeft() == null )
                {
                    head.setLeft( new TreeNode<Character>( ' ', null, null ));
                }
                head = head.getLeft();
            }
            if ( c == DASH)
            {
                if (head.getRight() == null)
                {
                    head.setRight( new TreeNode<Character>( ' ', null, null ));
                }
                head = head.getRight();
            }
        }
        head.setValue(letter);
        head = decodeTree;
    }

    /**
     *  converts text into Morse
     *
     *   @return the encoded message.
     */
    public static String encode(String text)
    {
        StringBuffer morse = new StringBuffer(400);

        char[] array = text.toUpperCase().toCharArray();
        for ( char c: array)
        {
            if( codeMap.containsKey( c ))
            {
                morse.append( codeMap.get( c ) + " " );
            }
            else
            {
                morse.append(" ");
            }
        }
        
        return morse.toString();
    }

    /**
     *   Converts the morse code into string
     *
     *   @return the plain text message.
     */
    public static String decode(String morse)
    {
      StringBuffer text = new StringBuffer(100);
      String[] string = morse.split( "[\\s]" );
      for( int i = 0; i < string.length; i++)
        {
            if (string[i].equals( " " ))
            {
                text.append( " ");
            }
            else
            {
                char[] array = string[i].toCharArray();
                TreeNode<Character> head = decodeTree;
                for ( char c : array)
                {
                    if ( c == DOT)
                    {
                        head = head.getLeft();
                    }
                    if ( c == DASH)
                    {
                        head = head.getRight();
                    }
                }
                text.append( head.getValue());
            }
        }
        
        return text.toString();
    }

    //--------------------------------------------------------------------
    // For test purposes only. Not to be used in completing the assignment

    public TreeMap<Character, String> getCodeMap()
    {
        return codeMap;
    }

    public TreeNode<Character> getDecodeTree()
    {
        return decodeTree;
    }
}