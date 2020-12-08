package CodingBat;

import java.util.Arrays;

public class fix23 {
    public static int [] fix23 (int[] nums){
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i] == 2){
                if (nums[i+1] == 3){
                    nums[i+1] = 0;
                }
            }
        }return nums;
    }

    public static void main(String[] args) {
        int arr [] = {2,3,5};
        System.out.println(Arrays.toString(fix23(arr)));
    }
}
