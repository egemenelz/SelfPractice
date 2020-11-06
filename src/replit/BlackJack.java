package replit;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("house : ");
        int house = s.nextInt();
        System.out.print("player: ");
        int player = s.nextInt();

        if (player >= 21){
            System.out.println("bust");
        }else if (house > player){
            System.out.println("player loss");
        }else if (player == house){
            System.out.println("its a tie");
        }else {
            System.out.println("player wins");
        }

    }
}
