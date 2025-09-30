import java.util.Scanner;

public class calculator {
    public static void main (String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int button = sc.nextInt();
       int add = a+b;
       int sub = a-b;
       int mul = a*b;
       float div = a/b;

       switch (button) {
        case 1: System.out.println(add);
        break;
        case 2 : System.out.println(sub);   
        break;
        case 3: System.out.println(mul);
        break;
        case 4: System.out.println(div);
        break;
        default:System.out.println("Zero");
            break;
       }



    
    }
    
}
