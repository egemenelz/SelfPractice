package replit;

public class At3rd {
    public static String at3(String target, String word) {

        target = target.substring(0, 3) + word + target.substring(3);
        return target;
    }

    public static void main(String[] args) {
        System.out.println(at3("blabla", "a"));
    }

}
