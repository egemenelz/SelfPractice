package PracticeIt;

import java.util.Scanner;

public class JavaEndofLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        for(int i =1; i<= count; i++){
            count++;
            boolean check = scanner.hasNext();
        }
        String n = scanner.nextLine();
        System.out.println(count + " " + n);
        String n2 = scanner.nextLine();
        System.out.println(count + " " + n2);
        String n3 = scanner.nextLine();
        System.out.println(count + " " + n3);
    }
}
