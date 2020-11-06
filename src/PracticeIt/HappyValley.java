package PracticeIt;

import java.util.Scanner;

public class HappyValley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 19;
        if (age < 2 || age > 18){
            System.out.println("ineligible");
        }else if (age >= 17){
            System.out.println("scholar");
        }else if (age >= 14){
            System.out.println("high school");
        }else if (age == 13){
            System.out.println("impossible");
        }else if (age >= 11){
            System.out.println("middle");
        }else if(age >= 8){
            System.out.println("elementary");
        }else if(age >= 6){
            System.out.println("young reader");
        }else if(age >= 3){
            System.out.println("early childhood");
        }else{
            System.out.println("toddler");
        }



    }
}
/*
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

 */
