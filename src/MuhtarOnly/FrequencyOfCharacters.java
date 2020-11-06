package MuhtarOnly;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabbbaa";

        char[] arr = str.toCharArray();
        String result = "";

        for (char each1 : arr) {
            char eachChar = str.charAt(each1);
            int count = 0;
            for (char each2 : arr) {
                if (eachChar == each2) {
                    count++;
                }
            }
            if (count > 1 && !(result.contains("" + eachChar))) {
                result += "" + eachChar + count;
            }
        }
        System.out.println(result);
    }
}
