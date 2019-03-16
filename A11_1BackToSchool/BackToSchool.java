/**
 * 
 *  This is the main method that displays stuff
 * 
 *
 *  @author  Albert Su
 *  @version Oct 16, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: Fulk
 */
public class BackToSchool
{
    /**
     * Runs code
     * @param args n/a
     */
    public static void main( String[] args )
    {
        Person bob = new Person( "Coach Bob", 27, "M" );
        System.out.println( bob );

        Student lynne = new Student( "Lynne Brooke", 16, "F",
            "HS95129", 3.5 );
        System.out.println( lynne );

        Teacher mrJava = new Teacher( "Duke Java", 34, "M",
            "Computer Science", 50000 );
        System.out.println( mrJava );

        CollegeStudent ima = new CollegeStudent( "Ima Frosh", 18, "F",
            "UCB123", 4.0, 1, "English" );
        System.out.println( ima );
    }
}