package MuhtarOnly;

import java.util.Scanner;

public class YearMonthDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth of year ");
        int year = sc.nextInt();
        System.out.print("Enter your birth of month ");
        int month = sc.nextInt();
        System.out.print("Enter your birht of day ");
        int day = sc.nextInt();
        System.out.println(month+"/"+day+"/"+year);

        if (year % 4 == 0){
            System.out.println("It's leap year");
        }else{
            System.out.println("Nope");
        }
    }
}
