import java.util.Scanner;

class condition3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A and B are same  ");
        } else if (a > b) {
            System.out.println("A is Bigger than B");
        } else {
            System.out.println("B is Bigger than A");
        }

    }
}
