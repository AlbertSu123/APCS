import java.util.Scanner;
import java.io.*;

/**
   Finds all words between 3 and 5 chars

   @author  Albert Su
   @version 11/15/17

   @author Period - 2
   @author Assignment - JM Ch14 - DictionaryMaker

   @author Sources - Fulk
 */
public class DictionaryMaker
{
    private static final int MINLENGTH = 3, MAXLENGTH = 5;
    public static Scanner fileIn;       //public for test purposes
    public static PrintWriter fileOut;  //public for test purposes

    public static void main(String[] args) throws IOException
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter input file name: ");
        String fileName = kboard.next();

        openInputFile(fileName);
        if (fileIn == null)
        {
            System.out.println("*** Can't open " + fileName + " ***");
            return;
        }

        createOutputFile("RamblecsDictionary.java");
        if (fileOut == null)
        {
            fileIn.close();
            System.out.println("*** Can't create RamblecsDictionary.java ***");
            return;
        }

        int count = copyWords();
        System.out.println("Done: " + count + " words.");

        fileIn.close();
        fileOut.close();
    }

    /**
     *  Opens a file fileName (in the current folder)
     *  and places a reference to it into fileIn
     */ 
    public static void openInputFile(String fileName)
    {
        String pathname = fileName;
        File file = new File(pathname);

        try
        {
           fileIn = new Scanner(file);
        }
        catch(FileNotFoundException ex)
        {
            System.out.print( "*** Cannot open " + pathname + " ***" );
            System.exit( 1 );
        }
    }

    /**
     *  Creates a new file fileName (in the current folder)
     *  and places a reference to it into fileOut
     */ 
    public static void createOutputFile(String fileName)
    {
        File file = new File(fileName);

        try
        {
            fileOut = new PrintWriter(file);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println( "Cannot create" + fileName);
            System.exit( 1 );
        }
    }

    /**
     *  Reads all words from fileIn, selects the words that have
     *  from MINLENGTH to MAXLENGTH letters, converts them
     *  into upper case and writes the words into fileOut in
     *  Java syntax
     *  
     *  @return number of words processed
     */ 
    public static int copyWords()
    {
        int counter = 0;
        fileOut.print( "public class RamblecsDictionary\r\n" + 
            "{\r\n" + 
            "  public String words[] =\r\n" + 
            "  {" );
        while (fileIn.hasNext())
        {
            String str = fileIn.next();
            if(MINLENGTH <= str.length() && str.length() <= MAXLENGTH)
            {
                String r = str.toUpperCase();
                fileOut.println( "\"" + r +  "\",");//the line that took more time than the rest of the class combined
                counter++;
            }
            
        }
        fileOut.println( "};" );
        fileOut.println( "}" );
        return counter; 
    }
}

