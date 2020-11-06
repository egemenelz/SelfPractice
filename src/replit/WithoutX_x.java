package replit;

import java.util.Scanner;

public class WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("x")||word.startsWith("X")||word.endsWith("x")||word.endsWith("X")){
            word = word.replace("x","");
            word = word.replace("X","");
            word = word.substring(0);
            System.out.println(word);
        }else{
            System.out.println(word);
        }

    }
}
