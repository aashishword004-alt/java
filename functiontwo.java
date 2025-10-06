import java.util.Scanner;

public class functiontwo {
   public static int calCulator(int a , int b)
   {
       int sum = a*b;
       return sum;     
   }
   
    public static void main(String args[])

    {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();

     int sum = calCulator(a,b);
     System.out.print("Answer is " + sum);
    } 
    
}
