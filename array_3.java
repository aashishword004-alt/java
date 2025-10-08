import java.util.Scanner;

public class array_3 {
    
    // 2d  array

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] todarray = new int [row][col];

        for(int i=0; i<row; i++)
        {
            for( int j=0; j<col; j++)
            {
                todarray[i][j] = sc.nextInt();
            }
        }


        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            { 
                System.out.print(todarray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
