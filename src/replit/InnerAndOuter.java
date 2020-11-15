package replit;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        for (int i = 0; i <outer.length ; i++) {
            int eachNumIn = inner[i];
            int countIn = 0;
            for (int j = 0; j <outer.length ; j++) {
                if (eachNumIn == outer[i] ){
                    countIn++;
                }
            }if (countIn > 0 ){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}
