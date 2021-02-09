package CodingBat;

import java.util.Arrays;

public class front11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {};
        System.out.println(Arrays.toString(front11(arr1, arr2)));
    }

    public static int[] front11(int[] a, int[] b) {
        int[] myArr = new int[2];
        if (a.length < 2 && b.length > 2) {
            myArr[0] = b[0];
            myArr[1] = b[1];
        } else if (a.length > 2 && b.length < 2) {
            myArr[0] = a[0];
            myArr[1] = a[1];
        } else if ((a.length < 1 || a.length >=2) || (b.length < 1 || b.length >= 2)) {
            myArr[0] = a[0];
            myArr[1] = b[0];
        }
        return myArr;
    }
}
