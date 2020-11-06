package replit;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String seperator = scan.next();
        int count = scan.nextInt();
        String temp = "";
        for (int i = 1; i <= count ; i++) {
            if (i == count){
                temp+=word;
                break;
            }
           temp += word + seperator;
        }
        System.out.println(temp);
    }
}
