package Sorting;

import java.util.Arrays;


public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        cycle(nums);
        System.out.println(Arrays.toString(nums)); 
    }
    
    public static void cycle(int nums[]){
        for(int i = 0; i < nums.length; ++i){
            int correct = nums[i] - 1;
            if(nums[i] != correct){
                swap(nums, i, correct);
            }
            else{
                continue;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
