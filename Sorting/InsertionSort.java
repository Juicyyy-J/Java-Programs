package Sorting;

import java.util.Arrays;

public class InsertionSort {
    
    
    public static void main(String args[]) {
        int nums[] = {5, 3 ,2, 12,32,4, 53};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
                else
                    break;
            }
        }
    }
}

