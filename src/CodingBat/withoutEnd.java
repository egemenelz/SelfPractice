package CodingBat;

public class withoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
    }
    public static String withoutEnd(String str) {
        String result = "";
        if(str.length() > 2){
            result = str.substring(1,str.length()-1);
        }return result;
    }
}
