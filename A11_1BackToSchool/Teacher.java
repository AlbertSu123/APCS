/**
 * 
 * Teacher class
 *
 *  @author  Albert
 *  @version Oct 16, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: Fulk
 */
public class Teacher extends Person
{
    private String mySubject;

    private double mySalary;


    /**
     * Constructor
     * 
     * @param myName
     *            name of teacher
     * @param myAge
     *            age of teacher
     * @param myGender
     *            gender of teacher
     * @param subject
     *            subject that teacher teaches
     * @param salary
     *            salary of teacher
     */
    public Teacher( String myName, int myAge, String myGender, 
        String subject, double salary )
    {
        super( myName, myAge, myGender );
        mySubject = subject;
        mySalary = salary;
    }


    /**
     * Gets the subject
     * 
     * @return mySubject
     */
    public String getSubject()
    {
        return mySubject;
    }


    /**
     * Gets thesalary
     * 
     * @return mySalary
     */
    public double getSalary()
    {
        return mySalary;
    }


    /**
     * Sets the subject
     * 
     * @param subject
     *            of teacher
     */
    public void setSubject( String subject )
    {
        mySubject = subject;
    }


    /**
     * Sets the salary.
     * 
     * @param salary
     *            of teacher
     */
    public void setSalary( double salary )
    {
        mySalary = salary;
    }


    /**
     * Returns the string for class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " +
            mySubject + ", salary: " + mySalary;
    }
}