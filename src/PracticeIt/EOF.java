package PracticeIt;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNext()){
            System.out.print(count+" "+sc.nextLine());
            count++;
        }
        sc.close();

    }
}
