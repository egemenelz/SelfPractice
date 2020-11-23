package CodingBat;

import java.util.Arrays;

public class arrayFront9 {
    public static void main(String[] args) {
        int [] nums = {1,2,9};
        System.out.println(arrayFront9(nums));
    }
    public static boolean arrayFront9(int [] nums){
        int end = nums.length;
        if (end > 4) end =4;
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9){
                return true;
            }
        }return false;
    }
}
