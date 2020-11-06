package PracticeIt;

import java.util.Scanner;

public class contrubition {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Is your money multiplied 1 or 2 times? ");
        int times = console.nextInt();
        int sum = 0;


        if (times == 1){
            System.out.println("And how much are you contributing? ");
            int donation = console.nextInt();
            sum+= donation;
            System.out.println(sum);
        }if (times == 2){
            System.out.println("And how much are you contributing? ");
            int donation = console.nextInt();
            sum += 2* donation;
            System.out.println(sum);
        }

    }
}
