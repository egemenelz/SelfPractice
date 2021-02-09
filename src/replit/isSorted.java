package replit;

import java.util.Arrays;

public class isSorted {
    public static void main(String[] args) {

        int[] nums = {2, 3, 5, 4, 9};
        System.out.println((isSort(nums)));
    }

    public static boolean isSort(int[] nums) {

        boolean isSort = false;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] <= nums[i + 1]) {
               isSort = true;
            }else{
                isSort= false;
                break;
            }
        } return isSort;
    }
}
