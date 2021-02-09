package CodingBat;

public class EndOther {
    public static void main(String[] args) {
        String a  ="xyz";
        String b ="12xyz";
        System.out.println(endOther(a, b));
    }

    public static boolean endOther(String a, String b){
        boolean flag = true;
        if (a.length() < b.length()){
            b = b.substring(b.length()-(a.length()));
            for (int i = 0; i < a.length(); i++) {
                if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(i)){
                    flag =true;
                }else{
                    flag = false;
                    break;
                }
            }
        }else{
            a = a.substring(a.length()-(b.length()));
            for (int i = 0; i <b.length() ; i++) {
                if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(i)){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
