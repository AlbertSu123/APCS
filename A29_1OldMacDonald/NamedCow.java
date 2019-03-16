/**
 * 
 *  This is the named cow class that extends cow
 *
 *  @author  asu995
 *  @version Oct 23, 2017
 *  @author  Period: 2
 *  @author  Assignment: A29_1OldMacDonald
 *
 *  @author  Sources: None
 */
class NamedCow extends Cow
{
    private String myName;


    /**
     * Initializes a newly created Cow object so that it represents an Animal of
     * the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Cow
     * @param sound
     *            the sound the Cow makes
     */
    public NamedCow( String type,  String sound )
    {
        super(type, sound);
        myName = "";
        
    }
    /**
     * second constructor
     * @param type ie cow
     * @param sound ie moo
     * @param name ie elsie
     */
    public NamedCow(String type, String name, String sound )
    {
        super(type, sound);
        myName = name;
    
    }
    /**
     * 
     * gets the name
     * @return myName name of the cow
     */
    public String getName()
    {
        return myName;
    }

}
