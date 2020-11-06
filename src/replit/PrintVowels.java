package replit;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String vowels = "";

        String word = inp.nextLine();
        inp.close();

        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e'
                    || word.toLowerCase().charAt(i) == 'i' || word.toLowerCase().charAt(i) == 'o'
                    || word.toLowerCase().charAt(i) == 'u') {
                vowels += word.charAt(i);
            }
        }
        System.out.println(vowels);


    }
}
/*
a,e i o u
 */