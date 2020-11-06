package replit;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String listOfGuest = "";

        System.out.println("Please enter guest name:");
        String firstName = input.nextLine();

        while(true){

            System.out.println("Do you want to enter new guest name:");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("no")){
                break;
            }

            System.out.println("Please enter guest name:");
            String guestName = input.nextLine();

            listOfGuest = listOfGuest +", "+guestName;


        }
        System.out.println("Guest's list: "+firstName+""+listOfGuest);




    }
}
