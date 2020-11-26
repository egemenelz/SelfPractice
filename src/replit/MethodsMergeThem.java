package replit;

public class MethodsMergeThem {
    public static String mergeString(String one, String two) {
        String result = "";
        for (int i = 0; i < one.length() || i < two.length() ; i++) {
            if (i < one.length()){
                result += one.charAt(i);
            }if (i < two.length()){
                result += two.charAt(i);
            }
        }return result;




    }

    public static void main(String[] args) {
        System.out.println(mergeString("java", "selenium"));
    }
}
