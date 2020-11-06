package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            String threeChar = arr[i];
            threeChar = threeChar.substring(0, 3);
            System.out.println(threeChar);
        }


    }
}
