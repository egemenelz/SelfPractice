package CodingBat;

public class hasBad {
    public static void main(String[] args) {
        System.out.println(hasBad(""));
    }
    public static boolean hasBad(String str) {
        if(!str.isEmpty()){
            if(str.charAt(0) == 'b' || str.charAt(1) =='b'){
                if(str.contains("bad")){
                    return true;
                }
            }
        }
        return false;
    }
}
