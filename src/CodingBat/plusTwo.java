package CodingBat;

import java.util.Arrays;

public class plusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            arr[count++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[count++] = b[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {7,8,9,0,11};
        System.out.println(Arrays.toString(plusTwo(arr,arr1)));

    }
}
