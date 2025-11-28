import java.io.*;
import java.util.Scanner;


public class transposeSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n = sc.nextInt();
        int matrix[][] = new int [n][n];
       
        System.out.println("Enter elements");
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; ++i){
            for(int j = i + 1; j < n; ++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < matrix[0].length; ++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}