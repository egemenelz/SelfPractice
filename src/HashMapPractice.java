import java.util.*;


public class HashMapPractice {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Map<String, String> keyword = new LinkedHashMap<>();
        keyword.put("crashed", "Are the device drivers up to date?");
        keyword.put("blue", "Ah, the blue screen! And then what happened?");
        keyword.put("hacked", "You should consider installing anti-virus software.");
        keyword.put("bluetooth", "The solution is as simple as enabling it.");
        keyword.put("windows", "Ah, I think I see your problem. What version?");
        keyword.put("apple", "You do mean the computer kind of apple don't you?");
        keyword.put("spam", "You should see if your mail client can filter messages.");
        keyword.put("connection", "Contact your internet provider.");
        System.out.println("Welcome to the automated technical support system.");
        System.out.println("Please describe your problem:");
        while (true) {
            String answer = src.nextLine();
            String[] arr = answer.split(" ");
            if (answer.equalsIgnoreCase("quit")) {
                System.exit(1);
            }

            for (String each : arr) {
                if (keyword.containsKey(each)) {
                    System.out.println(keyword.get(each));
                    break;
                }
            }

            while (!answer.contains("crashed") && !answer.contains("blue") && !answer.contains("hacked") && !answer.contains("bluetooth")
                    && !answer.contains("windows") && !answer.contains("apple") && !answer.contains("spam")
                    && !answer.contains("connection")) {
                System.out.println("Curious, tell me more.");
                break;
            }


        }

    }
}




