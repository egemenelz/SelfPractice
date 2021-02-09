package replit;

import java.util.Arrays;

public class Smth {
    public static String[] reverse(String[] arr) {
        //write your codes here
        String[] arr2 = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0 || j < arr.length; i--, j++) {
            arr2[j] = arr[i];
        }
        return arr2;

    }

    public static void main(String[] args) {
        String arr[] = {"apple", "pear"};
        System.out.println(Arrays.toString(reverse(arr)));
        String str = "asdfasfa";
        int arr2[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(do_switch(arr2)));
    }

    public static int[] do_switch(int[] i) {
        int[] arr = new int[i.length];
        for (int j = 1; j < arr.length - 1; j++) {
            arr[j] = i[j];
        }
        arr[0] = i[i.length - 1];
        arr[arr.length - 1] = i[0];
        return arr;

    }
}
