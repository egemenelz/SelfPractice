package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindingMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        String length = "";

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        for (int i = 0; i <5 ; i++) {
            if (words[i].length() > length.length()){
                length = words[i];
            }
        }
        System.out.println(length);


    }
}
