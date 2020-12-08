package CodingBat;

public class seeColor {
    public static void main(String[] args) {

        System.out.println(seeColor("blu"));
    }

    public static String seeColor(String str) {
        if (str.length() >= 3 && (str.charAt(0) == 'r' || str.charAt(0) == 'b')) {
            if (str.contains("red")) {
                str = str.substring(0, str.indexOf("d") + 1);
                return str;
            } else if (str.contains("blue")) {
                str = str.substring(0, str.indexOf("e") + 1);
                return str;
            }
        }
        return "";
    }
}
