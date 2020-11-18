package replit;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }
    public static void plus_minus(int [] arr){

        int frequencyPos = 0;
        int frequecnyNeg = 0;
        int frequencyZero = 0;

        for (int each:arr) {
            if (each > 0){
                frequencyPos++;
            }else if (each == 0){
                frequencyZero++;
            }else{
                frequecnyNeg++;
            }
        }
        System.out.println("positives:"+frequencyPos+", negatives:"+frequecnyNeg+", zeros:"+frequencyZero);

    }
}
