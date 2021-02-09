import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPrintFirst {
    public static void main(String[] args) {
        String [] arr ={"hello", "why", "by", "apple" , "note"};

        for (int i = 0; i < arr.length; i++) {
            String firstLast = arr[i];

            arr[i] = "" +firstLast.charAt(0) + firstLast.charAt(firstLast.length()-1);
            System.out.println(arr[i]);
        }


        int [] arr2 = {5, 8, 8, 5, 8};
        System.out.println(arr(arr2, 8));
        System.out.println(Arrays.toString(arr4(arr2)));

    }
    public static boolean arr(int [] arr2, int num){

        for (int i = 0; i <arr2.length; i++) {
            if (arr2[i] == num){
                if (arr2[i+1] == num){
                    return true;
                }
            }
        }return false;
    }

    public static int [] arr4(int[] arr3){

        int [] arr4 = new int[arr3.length];

        for (int i = 1; i < arr4.length-1; i++) {
            arr4[i] = arr3[i];//{0 .8, 8, 5, 0 }
        }
        arr4[0] = arr3[arr3.length-1];
        arr4[arr4.length-1] = arr3[0];
        return arr4;

    }
}
