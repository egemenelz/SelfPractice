package CodingBat;

public class lastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
    }
    public static String lastTwo (String str){
        String result = "";
        if (str.length() > 1){
            char firstChar = str.charAt(str.length()-2);
            char secondChar = str.charAt(str.length()-1);
            result = str.substring(0,str.length()-2) + secondChar+firstChar;
        }return result;
    }
}
