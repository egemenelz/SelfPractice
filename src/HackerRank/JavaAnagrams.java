package HackerRank;

import java.util.Arrays;

public class JavaAnagrams {
    public static boolean isAnagram(String a, String b){
        char[] arr = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        int length = arr.length;

        for (int i = 0; i < length ; i++) {
            for (int j = i+1; j <length ; j++) {
                if (arr[j] < arr[i]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if(arr2[j] < arr2[i]){
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        if(arr == arr2){
            System.out.println("Anagrams");
            return true;
        }else{
            System.out.println("Not Anagrams");
            return false;
        }
    }

    public static void main(String[] args) {
        isAnagram("hello", "Hello");
    }
}
