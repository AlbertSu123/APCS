/**
 * 
 *  extends student class
 *
 *  @author  Albert Su
 *  @version Oct 16, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources:: Fulk
 */
public class CollegeStudent extends Student
{
    private String myMajor;

    private int myYear;


    /**
     * Constructor
     * @param myName name of student
     * @param myAge age of student
     * @param myGender gender of student
     * @param myIdNum id of student
     * @param myGPA gpa of student
     * @param year year of student
     * @param major major of student
     */
    public CollegeStudent(
        String myName,
        int myAge,
        String myGender,
        String myIdNum,
        double myGPA,
        int year,
        String major )
    {
        super( myName, myAge, myGender, myIdNum, myGPA );
        myMajor = major;
        myYear = year;
    }


    /**
     * Sets the major
     * @param major of student
     */
    public void setMajor( String major )
    {
        myMajor = major;
    }


    /**
     * Sets the year
     * @param year of student
     */
    public void setYear( int year )
    {
        myYear = year;
    }


    /**
     * Gets the major
     * @return myMajor
     */
    public String getMajor()
    {
        return myMajor;
    }


    /**
     * Gets the year
     * @return myYear
     */
    public int getYear()
    {
        return myYear;
    }


    /**
     * Returns the methods of the class
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}