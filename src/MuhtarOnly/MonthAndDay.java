package MuhtarOnly;

import java.util.Scanner;

public class MonthAndDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month(number)");
        int month = sc.nextInt();
        System.out.println("Enter Year");
        int year = sc.nextInt();

        if (month>= 1 && month <= 12){
            if (month == 2){
                if (year % 4 == 0){
                    System.out.println("29 Day");
                }else {
                    System.out.println("28 Day");
                }
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println("31 Day");
            }
            if (month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("30 Day");
            }
        }else {
            System.out.println("Invalid Value");
        }
    }
}
