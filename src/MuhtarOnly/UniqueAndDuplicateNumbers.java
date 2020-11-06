package MuhtarOnly;

import java.util.Scanner;

public class UniqueAndDuplicateNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers you want?");
        int[] numbers = new int[scan.nextInt()];

        System.out.println("Enter " + numbers.length + " integer");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();
        for (int j = 0; j < numbers.length; j++) {
            int arr = numbers[j];
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == arr) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Unique : " + numbers[j]);

            } else {

                System.out.println("Duplicate : " + numbers[j]);
            }
        }
    }
}
