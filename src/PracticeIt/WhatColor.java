package PracticeIt;

import java.util.Scanner;

public class WhatColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color do you want? ");
        String color = scanner.nextLine();
        if (color.equalsIgnoreCase("B")) {
            System.out.println("You have chosen Blue.");
        } else if (color.equalsIgnoreCase("G")) {
            System.out.println("You have chosen Green.");
        } else if (color.equalsIgnoreCase("R")) {
            System.out.println("You have chosen Red.");
        } else {
            System.out.println("Unknown color: " + color);
        }
        sumTo(5);
    }

    public static int sumTo(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            sum += i;
            System.out.println(sum);
            return sum;

        }
        return n;


    }
}
