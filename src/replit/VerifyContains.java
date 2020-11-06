package replit;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean isContain = sentence.contains(word);
        System.out.println(isContain);


    }
}
