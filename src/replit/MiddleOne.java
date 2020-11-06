package replit;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() % 2 != 0) {
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            }if (word.length() < 2) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print(word);
                    }
                }
        }else{
            if (word.length() >= 4) {
                System.out.println((word.substring(word.length() / 2-1,word.length()/2+1)));
            }if(word.length() == 2) {
                for (int i = 0; i < 2; i++) {
                    System.out.print(word);
                }
            }
        }

    }
}
