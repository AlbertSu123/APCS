/**
 * 
 * Pig is an animal
 *
 * @author asu995
 * @version Oct 23, 2017
 * @author Period: 2
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: none
 */
class Pig implements Animal
{
    private String myType;

    private String mySound;


    /**
     * Pig
     * 
     * @param type
     *            the type
     * @param sound
     *            the sound ie oink
     */
    public Pig( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * the sound
     * 
     * @return mySound ie moo
     */
    public String getSound()
    {
        return mySound;
    }


    /**
     * gets type
     * 
     * @return myType ie cow
     */
    public String getType()
    {
        return myType;
    }

}