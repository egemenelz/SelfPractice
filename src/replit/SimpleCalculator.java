package replit;

import com.sun.tools.javac.file.SymbolArchive;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        plus();
    }

    public static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = scan.nextInt();
        System.out.println("Enter second number:");
        int secondNum = scan.nextInt();
        System.out.println("result: "+firstNum+secondNum);
    }
}
