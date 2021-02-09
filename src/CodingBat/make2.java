package CodingBat;

import java.util.Arrays;

public class make2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[] = {7,8};
        System.out.println(Arrays.toString(make2(arr, arr2)));
    }

    public static int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if (a.length < 1) {
            for (int i = 0; i < 2; i++) {
                arr[i] = b[i];
            }
        } else if (a.length < 2) {
            arr[0] = a[0];
            arr[1] = b[0];
        } else if (b.length < 1 || b.length >= 2) {
            for (int i = 0; i < 2; i++) {
                arr[i] = a[i];
            }
        }
        return arr;
    }
}
