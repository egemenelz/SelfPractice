package replit;

import java.util.Scanner;

public class ArraysFindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int j = 0; j < nums.length ; j++) {
            int compare = nums[j];
            int count = 0;
            for (int i = 0; i <nums.length ; i++) {
                if (compare == nums[i]){
                    count++;
                }
            }if (count == 1){
                System.out.println(compare);
            }
        }

    }
}
