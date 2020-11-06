package MuhtarOnly;

import java.util.Scanner;

public class SpecialLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zipcode? ");
        long zipCode = sc.nextLong();
        System.out.print("How many people live there? ");
        byte people = sc.nextByte();
        System.out.println("Are you married? ");
        boolean isMarried = sc.hasNextBoolean();

        System.out.println("I see, you are married "+isMarried+
                " and living with "+people+" people in your house which is in the "+
                zipCode+" area.");

    }
}
