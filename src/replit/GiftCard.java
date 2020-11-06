package replit;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int giftCard = 100;
        System.out.println("Select Item");
        String item = sc.nextLine();

        int balance = 0;

        if (item.equals("Smartphone")){
            balance = giftCard - 300;
        }else if (item.equals("Laptop")){
            balance = giftCard - 400;
        }else if (item.equals("Charger")){
            balance = giftCard - 15;
        }else if(item.equals("USB cable")){
            balance = giftCard - 10;
        }else if (item.equals("Headphones")){
            balance = giftCard - 30;
        }else if (item.equals("Pants")){
            balance = giftCard - 50;
        }else if (item.equals("Hat")){
            balance = giftCard - 25;
        }else if (item.equals("Socks")){
            balance = giftCard - 5;
        }else if (item.equals("Blanket")){
            balance = giftCard - 60;
        }else if (item.equals("Pillow")){
            balance = giftCard - 40;
        }else {
            System.out.println("Invalid item!");
        }

        if (balance < 0 ){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        if (balance > 0){
            System.out.println("Thank you for purchase!");
            System.out.println("Your current balance is: "+balance+"$");
        }
    }
}
