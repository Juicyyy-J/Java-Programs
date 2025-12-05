import java.util.Scanner;
public class RotateMatrix {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("\nEnter size of matrix :");
        n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Enter elements :");
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
            int j = 0, k = n - 1;
            while(j < k){
                int temp = matrix [i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp; 
                j++;
                k--;
            }
        }
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < matrix[i].length; ++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
