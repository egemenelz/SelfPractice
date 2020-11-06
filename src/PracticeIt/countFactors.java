package PracticeIt;

public class countFactors {
    public static int countFactors(int n){
        int factor = 0 ;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                factor = i;
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        System.out.println(countFactors(420));
    }
}
