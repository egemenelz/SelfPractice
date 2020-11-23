package CodingBat;

public class stringSplosion {
    public static void main(String[] args) {

        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str){
        String result = "";
        for (int i = 0; i < str.length()+1; i++) {
            result += str.substring(0,i);
        }
        return result;
    }
}
