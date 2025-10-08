public class stringbulder {
    public static void main(String args[])
    {
      StringBuilder sb = new StringBuilder("Toney");
      System.out.println(sb);  
      
      // find char  
     System.out.println(sb.charAt(0));

      //  set char
    //  sb.setCharAt(0, "P");
    //  for insert 
    sb.insert(2, "n");
      System.out.println(sb); 

      // delete 
      sb.delete(1, 5);
      System.out.println(sb);
    }
    
}
 