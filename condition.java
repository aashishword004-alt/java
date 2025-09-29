import java.util.Scanner;

class condition {
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a > 18)
    {
        System.out.println("You are Able to vote ");
    }
    else{
        System.out.println("you are not able");
    }

  }   
}
