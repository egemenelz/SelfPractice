package PracticeIt;

import java.util.Scanner;

public class spending {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.print("How much will "+ name  +" be spending? ");
        System.out.println();
        double amount = console.nextDouble();
        int numBills = (int)(amount / 20.0);
        if (numBills * 20.0 < amount){
            numBills++;
        }
        System.out.println(name+ " needs "+ numBills +" bills");
    }

    public static void spending(String name){


    }
}
