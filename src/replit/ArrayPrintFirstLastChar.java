package replit;

import java.util.Scanner;

public class ArrayPrintFirstLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        for (int i = 0; i < words.length; i++) {

            String firstLast = words[i];
            firstLast = "" + firstLast.charAt(0) + "" + firstLast.charAt(firstLast.length() - 1);
            System.out.println(firstLast);
        }
    }
}
