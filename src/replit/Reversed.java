package replit;

import java.util.Arrays;

public class Reversed {
    public static void main(String[] args) {
        String sentence  = "Java is fun";
        String reversed ="";

        String word [] = sentence.split(" ");
        for (int i = word.length-1; i >=0 ; i--) {
            reversed += word[i]+" ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);




    }
}
