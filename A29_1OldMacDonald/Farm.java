import java.util.*;

/**
   This is the farm class, displays name and farm noises
   
  
   @author  Albert Su
   @version 10/23/2017

   Period - 2
   Assignment - A29.1 Old MacDonald

   Sources - None
 */
class Farm
{
   private Animal[] a = new Animal[3];
   /**
    * farm constructor
    */
   public Farm()
   {      
      
      a[0] = new NamedCow("cow", "moo", "Elsie");
      a[1] = new Chick("chick", "cluckity cluck", "cheep");
      a[2] = new Pig("pig","oink oink");
   }
   /**
    * 
    * Prints out all the animal sounds
    */
   public void animalSounds()
   {
      for (int i = 0; i < a.length; i++)
      {
         System.out.println(a[i].getType() + " goes " + a[i].getSound());
      }
      NamedCow named = (NamedCow)a[0];
      System.out.println( named.getType() + " is named " + named.getName() );
   }
}

