package replit;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        System.out.print(txt.charAt(2));
        System.out.print(txt.charAt(4));
        System.out.print(txt.charAt(5));
    }
}
