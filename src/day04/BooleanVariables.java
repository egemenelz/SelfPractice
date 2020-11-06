package day04;

import java.util.Scanner;

public class BooleanVariables {
    public static void main(String[] args) {

        boolean r1 = true;
        boolean r2 = false;

        boolean r3 = 10>9;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println();

        int num1 = 100;
        int num2 = 200;
        boolean num3 = num1 > num2;
        System.out.println(num3);

        Scanner sc = new Scanner(System.in);

        boolean isMarried = sc.nextBoolean();
        System.out.println(isMarried);
    }
}
