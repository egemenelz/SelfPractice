package PracticeIt;

public class sumTo {
    public static int sumTo(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumTo(100000));
    }
}
