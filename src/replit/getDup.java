package replit;

import java.util.Arrays;

public class getDup {
    public static int getDup(String[] r) {
        int count = 0;
        for (String each : r) {
            int frequency = 0;
            for (String each1 : r) {
                if (each.equals(each1)) {
                    frequency++;
                }
            }
            if (frequency >1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "g", "aabb", "7", "7", "2", "aa", "7"};
        System.out.println(getDup(arr));
    }
}
