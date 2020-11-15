package replit;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }

    }
}
