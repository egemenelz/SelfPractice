package replit;

import java.util.Scanner;

public class SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String phoneNumber = message.substring(message.indexOf("2"),message.indexOf("]"));
        String messageBody = message.substring(message.indexOf("I"),message.indexOf("}"));

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);




    }
}
