package replit;

import java.util.Scanner;

public class ArrayReverse2 {
    public static void main(String[] args) {
        String str = "Java is fun";
        String [] arr = str.split(" ");
        String reversed = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            reversed+= arr[i]+" ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);

    }
}
