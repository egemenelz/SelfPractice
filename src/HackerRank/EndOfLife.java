package HackerRank;

import java.util.Scanner;

public class EndOfLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; input.hasNext() ; i++) {
            System.out.println(i+" "+input.nextLine());
        }
        input.close();
    }
}
