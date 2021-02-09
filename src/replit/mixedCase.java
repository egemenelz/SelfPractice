package replit;

import java.util.Scanner;

public class mixedCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String result = "";

        for (int i = 0, j = 1; i < s.length()-1 || j < s.length(); i += 2, j += 2) {
            result += s.substring(i, i + 1).toLowerCase();
            result += s.substring(j, j + 1).toUpperCase();

        }if (result.length() < s.length()) {
            result += s.substring(s.length() - 1).toLowerCase();
        }
        System.out.println(result);


    }
}
