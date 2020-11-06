package CodingBat;

public class BackAround {
    public static void main(String[] args) {

        System.out.println("cat = " + backAround("cat"));
    }
    public static String backAround(String str){
        char lastchar = str.charAt(str.length()-1);
        return lastchar+str+lastchar;
    }
}
