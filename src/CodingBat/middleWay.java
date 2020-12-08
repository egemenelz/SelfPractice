package CodingBat;

import java.util.Arrays;

public class middleWay {
    public static int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[2];

        int middlea = 0;
        int middleb = 0;

        for (int i = 0; i < a.length / 2 + 1; i++) {
            middlea = a[i];
            middleb = b[i];
        }

        arr[0] = middlea;
        arr[1] = middleb;
        return arr;

    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 6, 7, 8, 9};
        int arr2[] = {4, 5, 6, 9, 10, 11, 12};
        System.out.println(Arrays.toString(middleWay(arr1, arr2)));
    }
}
