import java.util.*;


/**
 * Java Methods Chapter 10 Exercises 2, 6 - 11, 14 - 15, 20 & 22
 * 
 * @author Albert Su
 * @version 10/6/2017
 * 
 * @author Period - 2
 * @author Assignment - Ch10Exercises
 * 
 * @author Sources - Fulk
 */
public class JMCh10Exercises
{
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public JMCh10Exercises()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public JMCh10Exercises( String str )
    {
        scan = new Scanner( str );
    }


    // 10-2(a)
    public boolean endsWithStar( String s )
    {
        int length = s.length();
        if ( !s.equals( "" ) && s.charAt( length - 1 ) == '*' )
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    // 10-2(b)
    /**
     * checks if ends in 2 stars
     * 
     * @param s
     *            string
     * @return true or false
     */
    public boolean endsWith2Stars( String s )
    {
        {
            int length = s.length();
            if ( length >= 2 && s.charAt( length - 2 ) == '*' && s.charAt( length - 1 ) == '*' )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }


    // 10-6
    /**
     * moves first letter and puts at end
     * 
     * @param s
     *            string
     * @return newString which is the new string
     */
    public String scroll( String s )
    {
        String newString = s.substring( 1 ) + s.charAt( 0 );

        return newString;
    }


    // 10-7
    /**
     * 
     * Converts someone's name with comma to a correct name
     * 
     * 
     * @param name
     *            name of person
     * @return name in correct order
     */
    public String convertName( String name )
    {

        String y;
        for ( int i = 1; i <= ( name.length() - 1 ); i++ )
        {
            if ( name.charAt( i ) == ',' )
            {
                y = ( name.substring( i + 1 ) );
                y = y.trim();
                name = name.substring( 0, i );
                name = y + " " + name;
                break;
            }
        }
        return name;
    }


    // 10-8
    /**
     * 
     * Replaces 0 with 1 and vice versa
     * @param str the string of numbers
     * @return the string with 1 and 0 reversed
     */
    public String negate( String str )
    {
        str = str.replace( "0", "2" );
        str = str.replaceAll( "1", "0" );
        str = str.replace( "2", "1" );
        return str; // FIX THIS!!!
    }


    // 10-9
    /**
     * 
     * sees if all things in a string are equal
     * @param s the string
     * @return true or false
     */
    public boolean isConstant( String str )
    {
        int x = str.length();
        if ( x <= 1 )
        {
            return true;
        }
        String s1 = str.substring( 0, x - 1 );
        String s2 = str.substring( 1 );
        if ( s1.equals( s2 ) )
        {
            return true;
        }
        return false; // FIX THIS!!!
    }


    // 10-10
    /**
     * remove comments in the string
     * 
     * @param str
     *            string
     * @return returnString the fixed string
     */
    public String removeComment( String str )
    {
        String returnString = "";
        int opening = str.indexOf( "/*" );
        int end = str.indexOf( "*/" );
        if ( opening == -1 || end == -1 )
        {
            returnString = str;
        }
        else
        {
            returnString = str.substring( 0, opening ) + str.substring( end + 2 );

        }

        return returnString; // FIX THIS!!!
    }


    // 10-11
    /**
     * cuts out string
     * 
     * @param s
     *            the string
     * @param s2
     *            what to cut out
     * @return newString which is the new string
     */
    public String cutOut( String s, String s2 )
    {
        // only looks for the first one
        return s.replaceFirst(s2, "");
    }


    // 10-14
    /**
     * removes the html tag
     * 
     * @param str
     *            the string
     * @return the new string without HTML tags
     */
    public String removeHtmlTags( String str )
    {
        int length = str.length();
        int beg = 0;
        int end = 0;
        for ( int i = 0; i < length - 1; i++ )
        {
            if ( str.charAt( i ) == '<' )//goes until it reaches the letter with the tag
            {
                if ( str.charAt( i + 2 ) == '>' )
                {
                    beg = i;
                }
                else if ( str.charAt( i + 1 ) == '/' && str.charAt( i + 3 ) == '>' )
                {
                    end = i;
                }
            }
        }
        if ( beg == 0 || end == 0 )
        {
            return str;
        }
        else
        {
            return str.substring( 0, beg ) + str.substring( beg + 3, end )
                + str.substring( end + 4 );
        }

    }


    // 10-15
    /**
     * checks if string is only digits
     * 
     * @param s
     *            the string
     * @return true or false whether it is only digits
     */
    public boolean onlyDigits( String s )
    {
        for ( int i = 0; i < s.length() - 1; i++ )
        {
            if ( s.charAt( i ) != '0' && s.charAt( i ) != '1' && s.charAt( i ) != '2'
                && s.charAt( i ) != '3' && s.charAt( i ) != '4' && s.charAt( i ) != '5'
                && s.charAt( i ) != '6' && s.charAt( i ) != '7' && s.charAt( i ) != '8'
                && s.charAt( i ) != '9' )
            {
                return false;
            }
        }

        return true;
    }


    // 10-20
    /**
     * checks if it is a valid ISBN #
     * 
     * @param isbn
     *            the string
     * @return whether it is or not
     */
    public static boolean isValidISBN( String isbn )
    {
        int total;

        if ( isbn.length() != 10 )
        {
            return false;
        }
        char d = isbn.charAt( 9 );
        if ( Character.toUpperCase( d ) == 'X' )
        {
            total = 10;
        }
        else if ( Character.isDigit( d ) )
        {
            total = Character.digit( d, 10 );
        }
        else
        {
            return false;
        }

        for ( int i = 8; i >= 0; i-- )
        {
            d = isbn.charAt( i );
            if ( Character.isDigit( d ) )
            {
                total += ( 10 - i ) * Character.digit( d, 10 );
            }
            else
            {
                return false;
            }
        }

        return ( total % 11 == 0 );

    }


    // 10-22
    /**
     * shuffles the string
     * 
     * @param s
     *            the string
     * @return the shuffled string
     */
    public String shuffle( String s )
    {
        StringBuffer sb = new StringBuffer( s );
        int n = sb.length();
        while ( n > 1 )
        {
            int i = (int)( Math.random() * n );
            char ch = sb.charAt( n - 1 );
            sb.setCharAt( n - 1, sb.charAt( i ) );
            sb.setCharAt( i, ch );
            n--;
        }
        return sb.toString();
    }


    /**
     * Testing method: instantiates a Ch18Ex1to5 object and then invokes each
     * method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        JMCh10Exercises exercise = new JMCh10Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) 10-2(a) endsWithStar( String s )" );
            System.out.println( "   (2) 10-2(b) endsWith2Stars( String s )" );
            System.out.println( "   (3) 10-6 scroll( String s )" );
            System.out.println( "   (4) 10-7 convertName( String name )" );
            System.out.println( "   (5) 10-8 negate( String str )" );
            System.out.println( "   (6) 10-9 isConstant( String s )" );
            System.out.println( "   (7) 10-10 removeComment( String str )" );
            System.out.println( "   (8) 10-11 cutOut( String s, String s2 )" );
            System.out.println( "   (9) 10-14 removeHtmlTags( String str )" );
            System.out.println( "   (A) 10-15 onlyDigits( String s )" );
            System.out.println( "   (B) 10-20 isValidISBN( String isbn )" );
            System.out.println( "   (C) 10-22 shuffle( String s )" );
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
                        String end1Star = "**endsWith**Star*";
                        System.out.println( "endsWithStar(" + end1Star + ") = "
                            + exercise.endsWithStar( end1Star ) );
                        String ends0Star = "**endsWith**Star*No";
                        System.out.println( "endsWithStar(" + ends0Star + ") = "
                            + exercise.endsWithStar( ends0Star ) );
                        break;
                    case '2':
                        String end2Str = "**endsWith**2Stars**";
                        System.out.println( "endsWith2Stars(" + end2Str + ") = "
                            + exercise.endsWith2Stars( end2Str ) );
                        String endsWith1Star = "**endsWith**2Stars*";
                        System.out.println( "endsWith2Stars(" + endsWith1Star + ") = "
                            + exercise.endsWith2Stars( endsWith1Star ) );
                        break;
                    case '3':
                        String scrollStr = "bdfhjlnprtvxz";
                        System.out.println( "scroll(\"" + scrollStr + "\") --> " + "\""
                            + exercise.scroll( scrollStr ) + "\"" );
                        break;
                    case '4':
                        String convStr = "von Neumann, John";
                        System.out.println( "convertName(\"" + convStr + "\") --> " + "\""
                            + exercise.convertName( convStr ) + "\"" );
                        break;
                    case '5':
                        String negStr = "1001110001010101110";
                        System.out.println( "negate(\"" + negStr + "\") --> " + "\""
                            + exercise.negate( negStr ) + "\"" );
                        break;
                    case '6':
                        String constStr1 = "0000000000000000000";
                        String constStr2 = "1001110001010101110";
                        System.out.println( "isConstant(\"" + constStr1 + "\") = "
                            + exercise.isConstant( constStr1 ) );
                        System.out.println( "isConstant(\"" + constStr2 + "\") = "
                            + exercise.isConstant( constStr2 ) );
                        break;
                    case '7':
                        String comment = "/* this should be gone */ int a = 0;";
                        String notComment = "/* this should stay /* int a = 0;";
                        System.out.println( "removeComment(\"" + comment + "\") --> " + "\""
                            + exercise.removeComment( comment ) + "\"" );
                        System.out.println( "removeComment(\"" + notComment + "\") --> " + "\""
                            + exercise.removeComment( notComment ) + "\"" );
                        break;
                    case '8':
                        String cutstr = "Hi-ho, hi-ho";
                        String cutOutstr = "-ho";
                        System.out.println( "cutOut(\"" + cutstr + "\", \"" + cutOutstr + "\") --> "
                            + "\"" + exercise.cutOut( cutstr, cutOutstr ) + "\"" );
                        break;
                    case '9':
                        String htmlStr = "Strings are <b>immutable</b>";
                        System.out.println( "removeHtmlTags(\"" + htmlStr + "\") --> " + "\""
                            + exercise.removeHtmlTags( htmlStr ) + "\"" );
                        break;
                    case 'A':
                    case 'a':
                        String digitStr = "123456789";
                        String dStr = "1234V5678";
                        System.out.println( "onlyDigits(\"" + digitStr + "\") = "
                            + exercise.onlyDigits( digitStr ) );
                        System.out.println(
                            "onlyDigits(\"" + dStr + "\") = " + exercise.onlyDigits( dStr ) );
                        break;
                    case 'B':
                    case 'b':
                        String validISBN = "096548534X";
                        String invalidISBN = "1234567890";
                        System.out.println( "isValidISBN(\"" + validISBN + "\") = "
                            + exercise.isValidISBN( validISBN ) );
                        System.out.println( "isValidISBN(\"" + invalidISBN + "\") = "
                            + exercise.isValidISBN( invalidISBN ) );
                        break;
                    case 'C':
                    case 'c':
                        String str = "The quick brown fox";
                        System.out.println( "shuffle(\"" + str + "\") --> " + "\""
                            + exercise.shuffle( str ) + "\"" );
                        System.out.println( "shuffle(\"" + str + "\") --> " + "\""
                            + exercise.shuffle( str ) + "\"" );
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
