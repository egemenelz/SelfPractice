package CodingBat;

public class IntMax {
    public static void main(String[] args) {

    }
    public static int intMax(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }else if (b >a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
