package replit;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds:");
        int second = sc.nextInt();

        int hour = second / 60;
        int min = hour % 60 ;
        int sec = second % 60;
            hour = hour /60;
        System.out.println(hour+" hours, "+min+" minutes, and "+sec+" seconds");

    }
}
