import java.util.*;


/**
 * 
 * Mailserver with dispatch and sign up methods
 * 
 * @author Albert Su
 * @version 1/18/17
 * 
 * @author Period - 2
 * @author Assignment - ActorsWorld
 * 
 * @author Sources - none
 */
public class MailServer extends LinkedList<Message>
{
    private Set<Actor> actors;
    
    
    public MailServer()
    {
        actors = new TreeSet<Actor>();
    }
 
    public void signUp( Actor actor )
    {
        actors.add( actor );
    }
 
 
    public void dispatch( Message msg )
    {
        if ( msg.getRecipient() == null )
        {
            for ( Actor actor : actors )
            {
                actor.receive( msg );
            }
        }
        else
        {
            msg.getRecipient().receive( msg );
        }
    }
    
    
    // for testing purposes only
    protected Set<Actor> getActors()
    {
        return actors;
    }
}