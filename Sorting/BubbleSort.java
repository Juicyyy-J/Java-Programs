package Sorting;

import java.util.Arrays;
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] nums = {-2, -4, -45, 2 ,4, 53};
        Sort(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    public static void Sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
                boolean swap = false; 
            for (int j = 1; j < nums.length - i; j++) {
                    if(nums[j] < nums[j - 1]){
                        int temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                        swap = true;
                    }
                    
            }
            if(!swap)
                break;
        }
    }
}
