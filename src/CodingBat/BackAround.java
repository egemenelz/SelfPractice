package CodingBat;

public class BackAround {
    public static void main(String[] args) {

        System.out.println(backAround("code"));
    }
    public static String backAround(String str){
        String temp = "";
        for(int i = str.length()-1; i >=0; i--){
            temp +=str.charAt(i);
        }return temp;
    }
}
