package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }
        for (int i = 0, j = 1; i < arr.length ; i+=2 , j+=2) {
            String firstString = arr[i];
            String secondString = arr[j];
            System.out.println(firstString+", "+secondString);
        }
        /*
        for(int i=0; i<4;i++) {
            for (int j = 2*i; j < 2*i+1 ; j++) {
                System.out.print(arr[j]+" , ");
            }
           System.out.println(arr[2*i+1]);
       }
         */
    }
}
