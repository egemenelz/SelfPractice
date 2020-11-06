package replit;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;

        if (inhabitants == 0){
            System.out.println("---- EXTINCT ----");
        }else {
            while (inhabitants > 0) {
                System.out.println("Day " + count + " [" + inhabitants + "]");
                inhabitants = inhabitants / 2;
                count++;
                if (inhabitants == 0) {
                    System.out.println("---- EXTINCT ----");
                    break;
                }
            }
        }
    }
}
