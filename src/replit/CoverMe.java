package replit;

public class CoverMe {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me"));
    }
    public static String coverString (String main, String coverME){

        if (main.contains(coverME)){
            String meWithBracket = "["+coverME+"]";
            main = main.replace(coverME,meWithBracket);
        }else{
            main = "["+main+"]";
        }
        return main;

    }
}
