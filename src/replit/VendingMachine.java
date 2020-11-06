package replit;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();
        int change = 100 - itemPrice;
        int quarters = change / 25;
        int dimes = (change-(quarters*25))/10;
        int nickel = (change - (quarters * 25)-(dimes * 10))/5;

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0){
            System.out.println("Invalid price!");
        }else{
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickel+" nickels.");
        }




    }
}
