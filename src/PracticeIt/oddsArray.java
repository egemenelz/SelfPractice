package PracticeIt;

import java.util.Arrays;

public class oddsArray {
    public static void main(String[] args) {
//        int odd[] = {};
//        for (int j = 0, i = -6; i < 38; j++, i++) {
//            if (i % 2 != 0) {
//                odd[j] = i;
//            }
//        }
        int[] first = new int[2];
        int[] second = new int[2];
        first[0] = 3;
        first[1] = 7;
        second[0] = 3;
        second[1] = 7;
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        if (Arrays.equals(first,second)) {
            System.out.println("equals");
        } else {
            System.out.println("not");
        }


    }
}
