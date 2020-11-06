package PracticeIt;

import java.util.Scanner;

public class TheInterview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Can i get your name?");
        String firstLast = scan.nextLine();
        String inital = firstLast.charAt(0)+","+ firstLast.substring(firstLast.indexOf(' '),firstLast.indexOf(' ')+2);
        System.out.println("inital = " + inital);
    }
}
