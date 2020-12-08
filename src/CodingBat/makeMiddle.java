package CodingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class makeMiddle {
    public static int[] makeMiddle(int[] nums){

        int [] arr = new int[2];
        int j =0;
        for (int i = nums.length/2-1; i < nums.length/2+1 ; i++) {
            arr[j++] = nums[i];
        }return arr;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,2,3,4,9};
        System.out.println(Arrays.toString(makeMiddle(arr)));
    }
}
