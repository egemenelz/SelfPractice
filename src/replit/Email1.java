package replit;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (email.contains("_")) {
            String firstName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String lastName = email.substring(0, email.indexOf("_"));
            email = firstName+"_"+lastName+email.substring(email.indexOf("@"));
            System.out.println(email);
        }else{
            System.out.println(email);
        }
    }
}
