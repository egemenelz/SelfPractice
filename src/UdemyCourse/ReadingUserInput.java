package UdemyCourse;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter =1;
        boolean hasNextInt = sc.hasNextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.println("Enter Number#" + counter + ":");

        }

        if (hasNextInt) {
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(sum);
        }else{
            System.out.println("Invalid Number");
        }sc.nextLine();
        sc.close();
    }
}
/*
-Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Create a Scanner like we did in the previous video.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message ÅgInvalid NumberÅh. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message ÅgEnter number #x:Åh where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be ÅgEnter number #1:Åh, the next ÅgEnter number #2: Åh, and so on.

Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you donÅft need it anymore.
-Create a project with the name ReadingUserInputChallenge
 */