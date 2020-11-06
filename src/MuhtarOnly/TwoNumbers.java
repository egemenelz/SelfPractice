package MuhtarOnly;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int numOne = sc.nextInt();
        System.out.println("Enter Second Number");
        int numTwo = sc.nextInt();

        if (numOne == numTwo){
            System.out.println("Two number is equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
