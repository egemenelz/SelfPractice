package replit;

public class WordCount {
    public static int wordCount(String words){
        String arr [] = words.split(" ");
        int count = 0;
        for (int i= 0; i < arr.length; i++){
            for (int j =0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }return count;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("one two three"));
    }
}
