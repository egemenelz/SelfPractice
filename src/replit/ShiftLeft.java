package replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int [] nums = {6 , 2 , 5 , 3};
        int [] arr = new int[nums.length];

        for (int i = 0; i < arr.length-1 ; i++) {// Start from 1 because we dont thouch 6
            arr[i] = nums[i+1];
        }arr[arr.length-1] = nums[0];
        System.out.println(Arrays.toString(arr));


    }
}
