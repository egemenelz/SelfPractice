package replit;

import java.util.Scanner;

public class ForLoopVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        String vowels = "";
        //vowels = a, e, i, o, u.

        for (int i = 0; i <= word.length()-1 ; i++) {

            if (word.toLowerCase().charAt(i) == 'a' ||word.toLowerCase().charAt(i) == 'e' ||word.toLowerCase().charAt(i) == 'i' ||
                    word.toLowerCase().charAt(i) == 'o' || word.toLowerCase().charAt(i) == 'u'){
                vowels += word.charAt(i);
            }
        }
        System.out.println(vowels);
    }
}
