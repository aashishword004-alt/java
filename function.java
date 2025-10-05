import java.util.Scanner;

class function {
    public static void printMyname(String name){
        System.out.println(name);
        return ;
      
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyname(name);
        
    }
    
}
 