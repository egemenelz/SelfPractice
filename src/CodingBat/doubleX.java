package CodingBat;

public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("xaxxx"));
    }
    public static boolean doubleX ( String str ){
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == 'x'){
                if (str.charAt(i+1) == 'x'){
                    return true;
                }
                return false;
            }
        }return false;
    }
}
