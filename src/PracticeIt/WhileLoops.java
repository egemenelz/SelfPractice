package PracticeIt;

import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = sc.nextInt();
        while (number > 0){
            number /= 2;
            System.out.println(number);
        }
    }
}
