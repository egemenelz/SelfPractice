package UdemyCourse;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        int primeNumber = 0;
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0){
                primeNumber = i;
                
            }
        }if (number <= 0){
            return -1;
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
        boolean A = true;
    }
}
