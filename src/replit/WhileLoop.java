package replit;

public class WhileLoop {
    public static void main(String[] args) {
        String word = "a";
        while (word.length() < 10){
            word ="b"+word+"b";
            System.out.println("word = " + word);

        }
    }
}
