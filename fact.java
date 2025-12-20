
import java.util.Scanner;

public class fact {
    public static void main(String argd[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to find factorial = ");
    int fact = sc.nextInt();
    for(int i=fact-1; i>=1; i--){
        fact = fact * i;

    }
    System.out.println("Factorial of 5 is " + fact);
    }
    
}
