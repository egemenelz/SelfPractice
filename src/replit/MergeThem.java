package replit;
import java.util.Scanner;
public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();
        String word2 = scan.next();
        String merge ="";


        if (word1.length() != 3 || word2.length() != 3){
            System.out.println("cannot merge");
        }else{
            for (int i = 0; i < 3 ; i++) {
                merge += word1.charAt(i);
                merge += word2.charAt(i);
            }
            System.out.println(merge);
        }
        
    }
}
