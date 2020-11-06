package CodingBat;

public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(13,7));
    }
    public static int close10(int a, int b){
        int firstNum = a - 10;
        int secondNum = b - 10;
        if (Math.abs(firstNum) == Math.abs(secondNum)){
            return 0;
        }else if (Math.abs(firstNum) > Math.abs(secondNum)){
            return Math.abs(b);
        }else {
            return Math.abs(a);
        }
    }
}
