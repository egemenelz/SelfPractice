package replit;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int candies = 0;
        int gummies = 0;

        System.out.println("Enter number of coupons:");
        int coupon = scan.nextInt();

        if (coupon > 3){
            candies = coupon / 10;
            gummies = (coupon % 10) / 3;
            System.out.println("Number of Candies: "+candies);
            System.out.println("Number of Gumballs: "+gummies);
        }else{
            System.out.println("Not enough coupons");
        }

    }
}
