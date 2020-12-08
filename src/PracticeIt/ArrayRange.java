package PracticeIt;

public class ArrayRange {
    public static int range(int[] number) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int range = 0;
        for (int each : number) {
            if (each > max) {
                max = each;
            }
        }
        for (int each : number) {
            if (each < min) {
                min = each;
            }
        }
        if (number.length > 1) {
            range = max - min + 1;
        } else {
            range = 1;
        }
        return range;
    }

    public static void main(String[] args) {
        int[] a3 = {32};
        System.out.println(range(a3));
    }
}
