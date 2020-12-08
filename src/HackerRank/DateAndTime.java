package HackerRank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {

    public static String findDay(int month, int day, int year) {

            String findDay = "";
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE");
            LocalDate localDate = LocalDate.of(year, month, day);
            findDay = localDate.format(dtf).toUpperCase();
            return findDay;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month : day : year ==>");
        System.out.println(findDay(scan.nextInt(),scan.nextInt(), scan.nextInt()));
    }

}