package MuhtarOnly;

import java.util.Scanner;

public class TriAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Angle");
        double first = sc.nextDouble();

        System.out.println("Enter Second Angle");
        double second = sc.nextDouble();

        double third = 180 - (first + second);
        System.out.println("Third angle is "+third);
        double triangle = first + second + third;
        System.out.println();

        if (triangle == 180){
            System.out.println("Its Perfect Triangle");
        }else {
            System.out.println("invalid angles");
        }

    }
}
