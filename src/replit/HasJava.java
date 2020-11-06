package replit;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.toLowerCase().startsWith("java") || word.toLowerCase().substring(1).startsWith("java"));

    }
}

