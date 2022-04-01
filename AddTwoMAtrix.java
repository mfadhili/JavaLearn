/*
 This program adds two matrices of any given range and size
 */

import java.util.Scanner;

public class AddTwoMAtrix{
    public static void main (String args[]){
        
        Scanner in = new Scanner(System.in); // new scanner object
        
        System.out.println("Enter the number of rows and columns of the matrix");
        int m = in.nextInt();
        int n = in.nextInt();
        int c;
        int d;
        
        int first[][] = new int[m][n];
        int second[][] =new int[m][n];
        int sum[][] = new int[m][n];
        
        System.out.println("Enter the elements of the first matrix: ");
        for(c=0; c<m ; c++)
            for(d=0; d<n; d++)
                first[c][d] = in.nextInt();
            
        System.out.println("Enter the elements of the second matrix: ");
        for(c=0; c<m; c++)
            for(d=0; d<n ; d++)
                second[c][d] = in.nextInt();
        for(c=0; c<m; c++)
            for(d=0; d<n ; d++)
                sum[c][d] = first[c][d] + second[c][d];
        
        System.out.println("Sum of the entered matrices: ");
        for (c = 0; c<m; c++)
        {
            for(d=0; d<n; d++)
                System.out.print(sum[c][d] + "\t");
                System.out.println();
        }
    }
}
