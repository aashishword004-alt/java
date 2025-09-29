import java.util.Scanner;

class condition3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
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
