// Revears the String

import java.util.Scanner;

public class questionstring {
    public static void main(String args[])
    {
         StringBuilder sb = new StringBuilder("Hello");

       for(int i=0; i<sb.length()/2; i++)
       {
        int fornt = i;
        int back = sb.length() -1 - i;
        
        char fontchar =sb.charAt(fornt);
        char backchar = sb.charAt(back);

        sb.setCharAt(fornt,backchar);
        sb.setCharAt(back, fontchar);
       }    
       System.out.println(sb);

    }
    
}
