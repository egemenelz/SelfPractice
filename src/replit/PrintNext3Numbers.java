package replit;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);//1
    }
    public static void next3 (int num){
        for (int i = 1; i < 4 ; i++) {
            System.out.print((num+i)+" ");
        }
    }

}
