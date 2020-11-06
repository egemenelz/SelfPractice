package PracticeIt;

public class forLoop {
    public static void main(String[] args) {
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at "+ i + " interest " + String.format("%.2f",calculateInterest(10000,i)));

        }
    parrotTrouble(true,8);
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if((hour > 7 || hour < 20 )){
            return talking;
        }return true;
    }

    public static boolean isPrime(int n){
        if(n ==1 ){
            return false;
        }
        for (int i = 2; i <= n/2 ; i++) {
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount,double i){
        return(amount * (i / 100));
    }
}
