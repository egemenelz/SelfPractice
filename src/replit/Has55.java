package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 1, 5};

        int count = 0;
        for (int i = 0; i <= nums.length -2; i++) {
            if (nums[i] == 5){
                if (nums[i+1] == 5){
                    count++;
                }
            }
        }if (count ==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
