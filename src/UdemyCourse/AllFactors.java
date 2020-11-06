package UdemyCourse;

public class AllFactors {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int primeNum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                primeNum = i;
                System.out.println(primeNum);
            }
        }
    }

    public static void main(String[] args) {
        printFactors(217);
    }
}
