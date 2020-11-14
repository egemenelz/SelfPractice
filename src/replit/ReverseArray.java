package replit;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 44, 1, 100, 55};

        for (int i = 0, j = nums.length - 1; i < nums.length/2; i++ ,j--) {
            int temp = nums[i];//nums[i] starting to declare from right side so, first time it is 4

            nums[i] = nums[j];//here declaring first index to last elemnet
            nums[j]= temp;// here declaring first element to last index
        }
        System.out.println(Arrays.toString(nums));


    }
}
