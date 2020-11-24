package CodingBat;

public class stringX {
    public static void main(String[] args) {

        System.out.println(stringX("xxHxixx"));

    }
    public static String stringX(String str){
        String result =  "";
        for (int i = 0; i <str.length(); i++) {
            char eachChar = str.charAt(i);

            if (!(i > 0 && i < str.length()-1 && str.substring(i,i+1).equals("x"))){
            result += str.substring(i,i+1);
            }
        }return result;
    }
}
