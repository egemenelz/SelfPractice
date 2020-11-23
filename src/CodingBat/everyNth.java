package CodingBat;

public class everyNth {
    public static void main(String[] args) {


        System.out.println(everyNth("Miracle", 2));
    }
    public static String everyNth(String str , int n){

        String temp = "";
        if (n >= 1 && str.length() > 2){
            for (int i = 0; i <str.length() ; i+=n) {
                temp += str.charAt(i);
            }
        }return temp;
    }
}
