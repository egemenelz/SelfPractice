package replit;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = sc.nextLine();

        if (fullName.equalsIgnoreCase("Max Payne")||fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}
