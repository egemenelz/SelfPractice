package replit;

import java.util.Scanner;

public class FibonnaciNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= num ; i++) {
            c = b + a;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
