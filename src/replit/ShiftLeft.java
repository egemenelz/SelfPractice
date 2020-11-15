package replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int [] arr = {6 , 2 , 5 , 3};
        int first = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i];
        }
        arr[arr.length-1] = first;
        System.out.println(Arrays.toString(arr));
    }
}
