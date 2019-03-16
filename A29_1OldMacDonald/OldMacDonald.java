class OldMacDonald
{
    /**
     * 
     * main method for testing
     * @param args the args
     */
   public static void main(String[] args)
   {
      
      Cow c = new Cow("cow", "moo");
      System.out.println( c.getType() + " goes " + c.getSound() );
      
      Chick chick = new Chick("chick", "cluck", "cheep");
      System.out.println( chick.getType() + " goes " + chick.getSound() );
      
      Pig p = new Pig ("pig", "oink");
      System.out.println( p.getType() + " goes " + p.getSound());
      // TODO <your code here>
   }
}
