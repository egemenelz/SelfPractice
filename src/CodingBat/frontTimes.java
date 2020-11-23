package CodingBat;

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Ab",4));
    }

    public static String frontTimes(String str, int n) {
        String result = "";
        if (str.length() >= 3) {
            for (int i = 0; i < n; i++) {
                result += str.substring(0, 3);
            }
        } else if (str.length() <= 2) {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        }
        return result;
    }
}
