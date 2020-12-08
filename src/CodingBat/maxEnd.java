package CodingBat;

import java.util.Arrays;

public class maxEnd {
    public static int [] maxEnd3 (int [] nums){
        int[]arr = new int[nums.length];
        int max = 0;
        if (nums[0] > nums[nums.length-1]){
            max = nums[0];
        }else{
            max = nums[nums.length-1];
        }
        for (int i = 0; i < nums.length ; i++) {
            arr[i] = max;
        }return arr;
    }

    public static void main(String[] args) {
        int[] nums = {5,11,3,4};

        System.out.println(Arrays.toString(maxEnd3(nums)));
    }
}
