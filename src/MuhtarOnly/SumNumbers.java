package MuhtarOnly;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <=num ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
