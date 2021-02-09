package CodingBat;

import java.util.Arrays;

public class frontPiece {
    public static void main(String[] args) {
        int arr[]={};
        System.out.println(Arrays.toString(frontPiece(arr)));
    }
    public static int[] frontPiece(int[] nums) {

        if(nums.length >= 2){
            int [] arr = new int[2];
            for(int i = 0; i < 2; i++){
                arr[i] = nums[i];
            }
            return arr;
        }else{
            int[] arr2 = new int[nums.length];
            if (nums.length >= 1){
                arr2[0] = nums[0];
            }
            return arr2;
        }
    }
}
