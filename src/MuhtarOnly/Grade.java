package MuhtarOnly;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Subject");
        int first = sc.nextInt();
        System.out.println("Second Subject");
        int second = sc.nextInt();
        System.out.println("Third Subject");
        int third = sc.nextInt();

        int grade = (first + second + third ) / 3;

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}
