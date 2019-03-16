/**
 * 
 * Chick class
 *
 * @author asu995
 * @version Oct 23, 2017
 * @author Period: 2
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: Fulk
 */
class Chick implements Animal
{
    private String myType;

    private String mySound;

    private String mysecondSound;
    /**
     * bob this is the second constructor without secondsound
     * @param type this is the type ie cow
     * @param sound ie moo
     */
    public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }
    /**
     * 
     * @param type
     *            what kind ie cow
     * @param sound
     *            what sound ie moo
     * @param secondSound
     *            the second sound for chick
     */
    public Chick( String type, String sound, String secondSound )
    {
        myType = type;
        mySound = sound;
        mysecondSound = secondSound;
    }


    /**
     * gets sound
     * 
     * @return some sound
     */
    public String getSound()
    {
        int randomNumGen = (int)( Math.random() * 2 );
        if ( randomNumGen == 1 )
        {
            return mysecondSound;
        }
        else
        {
            return mySound;
        }

    }


    /**
     * returns type
     * 
     * @return myType ie cow
     */
    public String getType()
    {
        return myType;
    }
    // TODO complete class
}