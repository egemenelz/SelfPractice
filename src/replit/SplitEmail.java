package replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int count = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                count++;
            }
        }
        if (count == 1) {
            String[] arr = email.split("@");
            System.out.println("Email id: " + arr[0]);
            System.out.println("Email domain: " + arr[1]);
        } else {
            System.out.println("invalid email");
        }


    }
}
