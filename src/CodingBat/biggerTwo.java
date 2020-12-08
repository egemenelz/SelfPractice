package CodingBat;

public class biggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        if (sumA > sumB || sumA == sumB) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
    }
}
