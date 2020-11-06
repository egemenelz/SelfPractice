package PracticeIt;

import java.util.Scanner;

public class PlayingCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a card: ");
        String rankOfHand = sc.nextLine();
        String rankOfSuit = sc.nextLine();

        if (rankOfSuit.equals("S")){
            System.out.print(" Spades");
        }else if (rankOfSuit.equals("C")){
            System.out.print(" Clubs");
        }else if(rankOfSuit.equals("D")){
            System.out.print(" Diamonds");
        }else if (rankOfSuit.equals("H")){
            System.out.print(" Hearts");
        }else if (rankOfHand.equals("2")){
            System.out.println("Two of ");
        }

    }
}
