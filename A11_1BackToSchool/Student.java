/**
 * 
 * extension of person class, has student stuff
 *
 *  @author  Albert Su
 *  @version Oct 16, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: Fulk
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number
    private double myGPA;   // grade point average
    /**
     * 
     * @param name of the new stuff
     * @param age new
     * @param gender new
     * @param idNum new
     * @param gpa new
     */
    public Student( String name, int age, String gender, String idNum,
                    double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }
    /**
     * 
     * sets the IDnum
     * @return the ID num
     */
    public String getIdNum()
    {
        return myIdNum;
    }
    /**
     * 
     * sets the GPA
     * @return my GPA of this student
     */
    public double getGPA()
    {
        return myGPA;
    }
    /**
     * 
     * sets the ID num
     * @param idNum the id num of student
     */
    public void setIdNum( String idNum )
    {
        myIdNum = idNum;
    }
    /**
     * 
     * sets the GPA
     * @param gpa what gpa student has
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }

    /**
     * Returns the methods
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: " +
            myIdNum + ", gpa: " + myGPA;
    }
}
