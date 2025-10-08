public class stringtwo {
    public static void main(String args[])
    {
        // connect the strings
        String name = "tony";
        String  sirname = "Stark";
        
         String fulname  = name + " " + sirname;
         System.out.println(fulname);
         System.out.println(fulname.length());
         // for charectar print
         for(int i=0; i<fulname.length(); i++ )
         {
            System.out.println(fulname.charAt(i));
         }
    }
    
}
