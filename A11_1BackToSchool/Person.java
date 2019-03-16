/**
 * 
 *  Person has all the shared parameters
 *
 *  @author  Albert Su
 *  @version Oct 16, 2017
 *  @author  Period: 2
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: Fulk
 */
public class Person
{
    private String myName; // name of the person

    private int myAge; // person's age

    private String myGender; // 'M' for male, 'F' for female


    /**
     * Constructor
     * @param name of person
     * @param age of person
     * @param gender of person
     */
    public Person( String name, int age, String gender )
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    /**
     * Gets name
     * @return myName
     */
    public String getName()
    {
        return myName;
    }


    /**
     * Gets age.
     * @return myAge
     */
    public int getAge()
    {
        return myAge;
    }


    /**
     * Gets gender
     * @return myGender
     */
    public String getGender()
    {
        return myGender;
    }


    /**
     * Sets the name
     * @param name of person
     */
    public void setName( String name )
    {
        myName = name;
    }


    /**
     * Sets the age.
     * @param age of person
     */
    public void setAge( int age )
    {
        myAge = age;
    }


    /**
     * Sets the gender
     * @param gender of person
     */
    public void setGender( String gender )
    {
        myGender = gender;
    }

    /**
     * Returns the methods of this class
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}