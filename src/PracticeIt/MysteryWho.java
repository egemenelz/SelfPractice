package PracticeIt;

public class MysteryWho {
    public static void main(String[] args) {
        String whom = "her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";

        sentence(he,she,it);
        sentence(she,he,who);
        sentence(who, she, who);

        double math = Math.max(18 - 5 + Math.random(), Math.ceil(4.6 * 3));
        System.out.println(math);
    }
    public static void sentence(String she, String who, String whom){
        System.out.println(who + " and " + whom + " like " + she);
    }
}
