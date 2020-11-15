package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintFirstLastChar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i <words.length ; i++) {
            String firstlast = words[i];
            words[i] = ""+firstlast.charAt(0)+""+firstlast.charAt(firstlast.length()-1);
        }
        System.out.println(Arrays.toString(words));

    }
}
