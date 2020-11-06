package replit;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;

        String temp = str.substring(0,n);
        while(str.contains(temp)){
            str = str.replaceFirst(temp,"");
            count++;
        }
        System.out.println(count > 1);

    }
}
