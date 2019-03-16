import java.util.*;

/**
 * Maintains a set of registered subscribers
 * 
 * @author Albert Su
 * @version 1/17/18
 * 
 * @author Period - 2
 * @author Assignment - 21_6 ActorsWorld 
 * 
 * @author Sources - none
 */
public class MailServer extends LinkedList<Message>
{
    private Set<Actor> actors;
    
    /**
     * 
     * add actor to set of registered subscribers
     * @param actor actor to add
     */
    public void signUp(Actor actor)
    {
       
    }
    /**
     * 
     * Sends msg to recipient(msg) or send to all if msg is null
     * @param msg who the recipient is
     */
    public Message dispatch( Message msg )
    {
        if(msg == null)
        {
            
        }
        return msg;
        // TODO Auto-generated method stub
        
    }
    
    // for testing purposes only
    protected Set<Actor> getActors()
    {
        return actors;
    }

}
