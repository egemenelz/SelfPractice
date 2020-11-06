package PracticeIt;

import java.util.Scanner;

public class cumulativeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int firstNum = sc.nextInt();
        int total = 1;
        for (int i = 0; i < firstNum; i++) {
            System.out.print("Next Number --> ");
            int number = sc.nextInt();
            total = total * number;
        }
        System.out.print("Product = "+total);

    }
}
