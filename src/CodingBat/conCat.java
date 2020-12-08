package CodingBat;

public class conCat {
    public static void main(String[] args) {
        System.out.println(conCat("dog", "cat"));
    }

    public static String conCat(String a, String b) {
        String result = "";
        if (a.length() != 0 && b.length() != 0) {
            if (a.charAt(a.length() - 1) == (b.charAt(0))) {
                result = a + b.substring(1);
            }else{
                result = a+b;
            }
        } else {
            result = a + b;
        }
        return result;
    }
}
