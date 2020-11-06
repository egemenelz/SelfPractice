package replit;

public class SliceNumbers2 {
    public static void main(String[] args) {

        int number = 345673474;

        String str = "" + number;

        for (int i = 0; i <str.length() ; i++) {
            System.out.println("digit "+(i+1)+": "+str.charAt(i));
        }

    }
}
