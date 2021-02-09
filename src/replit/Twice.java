package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Twice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(list));
    }

    /**
     * target - string that you need to check.
     * sentence - string where you need to lookup for target.
     * Main.appearsTwice("java", "java is fun!")
     * - returns false, because java appears only once.
     * <p>
     * Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
     * - returns true, because laptop appears twice.
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        int count = 0;
        sentence = sentence.replace(',', ' ');
        String arr[] = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            numbers.add(list.get(i));
            numbers.add(list.get(i));
        }
        return numbers;
    }
}
