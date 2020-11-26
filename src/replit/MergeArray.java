package replit;

import java.util.Arrays;

public class MergeArray {
    public static int[] mergR(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(mergR(a, b)));
    }
}
