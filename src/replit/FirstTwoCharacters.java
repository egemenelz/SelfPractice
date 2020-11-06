package replit;

import java.util.Scanner;

public class FirstTwoCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.print(txt.substring(0,2));
    }
}
