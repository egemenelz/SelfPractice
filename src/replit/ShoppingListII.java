package replit;

import java.util.Scanner;

public class ShoppingListII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        double counted1 = price1 * count1;

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        double counted2 = price2 * count2;

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        double counted3 = price3 * count3;

        double totalPrice = 0;

        if (count1 > 0 && count2 > 0 && count3 > 0){
            totalPrice = counted1+ counted2 + counted3;
            System.out.println("Item1: "+item1+" Price: "+counted1+", Item2: "+item2+" Price: "+count2+", Item3: "+item3+" Price: "+counted3);
        }else if (count2 <= 0){
            totalPrice = counted1 + counted3;
            System.out.println("Item1: "+item1+" Price: "+counted1+", Item3: "+item3+" Price: "+counted3);
        }else {
            totalPrice = counted1+ counted2;
            System.out.println("Item1: "+item1+" Price: "+counted1+", Item2: "+item2+" Price: "+counted2);
        }
        System.out.println("Total Price: "+totalPrice);



    }
}
