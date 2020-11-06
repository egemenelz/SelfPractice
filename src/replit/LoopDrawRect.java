package replit;

import java.util.Scanner;

public class LoopDrawRect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 3;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= x ; j++) {
                System.out.print("x");
            }System.out.println();
        }

    }
}
