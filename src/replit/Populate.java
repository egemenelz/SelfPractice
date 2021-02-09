package replit;

import java.util.Arrays;

public class Populate {
    public static int[] populate(int[] r) {
        //write your codes here
        int[] arr = new int[r.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i+1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] i = new int[5];
        i = populate(i);
        System.out.println(Arrays.toString(i));

    }
}
