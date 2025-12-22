package Sorting;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int nums[] = {5, 3 ,2, 12,32,4, 53};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        for(int i = 0; i < nums.length; ++i){
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min])
                    min = j;
                }
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            
        }
    }
}
