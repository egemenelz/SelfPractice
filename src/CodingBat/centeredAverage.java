package CodingBat;

import java.util.Arrays;

public class centeredAverage {
    public static int centeredAverage(int[] nums) {
        //1, 2, 3, 4, 100
        int min = nums[0];// 1
        int max = nums[0];// 100
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
            sum+= nums[i];
        }

        sum -= max - min;
        sum = sum / (nums.length-2);
        return sum;


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(nums));
    }
}
