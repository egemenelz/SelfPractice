package replit;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int half = word.length() /2;
        String halfPrint = word.substring(0,half);
        for (int i = 1; i <=2 ; i++) {
            System.out.print(halfPrint);
        }


    }
}
