package replit;

import java.util.Arrays;

public class CopyCertainValues {
    public static void main(String[] args) {

        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }
    public static String[] getWithE(String[] arr){
        String containE = "";
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].contains("e")){
                containE += arr[i]+" ";
            }
        }
        String[] fewValues = containE.split(" ");
        return fewValues;
    }
}

