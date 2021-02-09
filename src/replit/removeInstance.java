package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class removeInstance {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {   // write your codes here :
        r.removeIf(p -> p == n);
        return r;

    }// end of your code


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));


    }//end main
}
