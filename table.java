import java.util.Scanner;

public class table {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print table = ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println( n + "*" +  i +   "="  + i * n);
        }
        // make this one outpute 1*1=1 tommorow

    }
    
}
