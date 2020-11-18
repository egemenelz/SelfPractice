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
        for (int i = 0; i < sizeInner; i++) {
            System.out.println("enter inner");
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            System.out.println("enter outer");
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        int frequency = 0;
        for (int outerEach : outer){
            for (int i = 0; i <inner.length ; i++) {
                if (outerEach == inner[i]){
                    frequency++;
                }
            }
        }if (frequency >= sizeInner && frequency <= sizeOuter){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
