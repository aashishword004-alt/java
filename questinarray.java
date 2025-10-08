// Take a matric as input from the user .
// Search for a given number x abd print the indices at which it occurs.

import java.util.Scanner;

public class questinarray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int row =   sc.nextInt();
        int col =   sc.nextInt();

        int number [][] = new int [row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                number[i][j] = sc.nextInt();
            }
        }
    int x = sc.nextInt();

    for(int i=0; i<row; i++)
    {
        for(int  j=0; j<col; j++)
        {
            if(number[i][j] == x)
            {
                System.out.println("X is found  ("  + i  +" , " + j + ")  ");

            }
        }
    }

        
    }
    
}
