package CodingBat;

public class theEnd {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello",true));
    }
    public static String theEnd(String str, boolean front){
        if (front == true){
            str = str.substring(0,1);
        }else {
            str = str.substring(str.length()-1);
        }return str;

    }
}
