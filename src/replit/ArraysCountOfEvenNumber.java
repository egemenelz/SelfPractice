package replit;

import java.util.Scanner;

public class ArraysCountOfEvenNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i <= 9; i++) {
            nums[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
