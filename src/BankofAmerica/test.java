package BankofAmerica;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String email = "egemenelz@gmail.com";
        System.out.println(validEmail(email));
        String phone = "760-704-9927";
        System.out.println(validPhone(phone));
        Random r = new Random();
        int account = r.nextInt(Integer.MAX_VALUE);
        System.out.println(account);
    }
    public static boolean validEmail(String email) {
        String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pat = Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pat.matcher(email);
        return matcher.find();
    }
    public static boolean validPhone(String phoneNumber) {
        String phonePattern ="^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";
        Pattern pat = Pattern.compile(phonePattern);
        Matcher matcher = pat.matcher(phoneNumber);
        return matcher.find();
    }
}
