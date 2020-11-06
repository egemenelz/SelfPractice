package replit;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);
        System.out.println(firstChar+""+lastChar);

    }
}
