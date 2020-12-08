package CodingBat;

public class countxx {
    public static void main(String[] args) {
        String str = "xxxx";
        System.out.println(countxx(str));
    }
    public static int countxx(String str){
        int count = 0;
        for (int i= 0; i < str.length()-1;i++ ){
            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                count++;
            }
        }return count;
    }
}
