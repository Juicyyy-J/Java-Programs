import java.util.ArrayList;
import java.util.Scanner;
public class SpiralMatrix {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n = sc.nextInt();
        int [][] matrix = new int [n][n];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                matrix[i][j] = sc.nextInt();
            }
        } 

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        ArrayList<Integer> list = new ArrayList<>();

        // if(matrix == null || matrix.length == 0)
        //     System.out.println("Empty");

        while(left <= right && top <= bottom){
            
        for(int i = left; i <= right; ++i){
            list.add(matrix[top][i]);    
        }
        top++;

        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);            
        }
        right--;

        if(top <= bottom){
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
        }
        

        if(left <= right){
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        
        }
        
        System.out.println(list);
        
        sc.close();
    }
}

