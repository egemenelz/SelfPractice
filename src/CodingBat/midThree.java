package CodingBat;

import java.util.Arrays;

public class midThree {
    public static void main(String[] args) {
        int[] arr = {8, 6, 7, 5, 3, 8, 9, 10, 11, 11, 11, 12, 13};
        System.out.println(Arrays.toString(midThree(arr)));
    }

    public static int[] midThree(int[] nums) {
        int[] arr = new int[3];
        int j = 0;

        for (int i = nums.length / 2 - 1; i <= nums.length / 2 + 1; i++) {
            arr[j] = nums[i];
            j++;
        }
        return arr;
    }
}
