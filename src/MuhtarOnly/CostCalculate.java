package MuhtarOnly;

import java.util.Scanner;

public class CostCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product price");
        int proPrice = sc.nextInt();
        System.out.println("Quantity");
        int quantity = sc.nextInt();

        int cost = proPrice * quantity;
        System.out.println("Cost is "+cost);
        int discount = 0;

        if (cost > 5000){
            System.out.println("10 % discount offered");
            discount = cost / 10;
            cost = cost - discount;
            System.out.println("Discounted Cost "+cost);
        }
    }
}

