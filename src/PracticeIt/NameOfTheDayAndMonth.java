package PracticeIt;

import java.sql.SQLOutput;

public class NameOfTheDayAndMonth {
    public static void main(String[] args) {
        int day = 7;
        String nameOfDay;

        if (day == 1){
            nameOfDay = "Monday";
        }else if (day ==2){
            nameOfDay = "Tuesday";
        }else if (day == 3){
            nameOfDay = "Wednesday";
        }else if (day == 4){
            nameOfDay = "Thursday";
        }else if(day == 5){
            nameOfDay = "Friday";
        }else if(day == 6){
            nameOfDay = "Saturday";
        }else {
            nameOfDay = "Sunday";
        }
        if (day <= 5){
            System.out.println(nameOfDay +" is Weekday");
        }else {
            System.out.println(nameOfDay+" is Weekend");
        }

        //==============================================\\

        int month = 14;
        String nameOfMonth;

        if (month == 1){
            nameOfMonth = "January";
        }else if (month ==2){
            nameOfMonth ="February";
        }else if (month ==3){
            nameOfMonth ="March";
        }else if (month ==4){
            nameOfMonth ="April";
        }else if (month ==5){
            nameOfMonth ="May";
        }else if (month ==6){
            nameOfMonth ="June";
        }else if (month ==7){
            nameOfMonth ="July";
        }else if (month ==8){
            nameOfMonth ="August";
        }else if (month ==9){
            nameOfMonth ="September";
        }else if (month ==10){
            nameOfMonth ="October";
        }else if (month ==11){
            nameOfMonth ="November";
        }else {
            nameOfMonth ="December";
        }
        System.out.println(nameOfMonth);
    }
}
