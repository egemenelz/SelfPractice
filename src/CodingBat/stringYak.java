package CodingBat;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("pakyak"));
    }
    public static String stringYak(String str){
        if (str.length() > 2) {
            if (str.contains("yak")) {
                str = str.replace("yak", "");
            }
        }return str;
    }
}
