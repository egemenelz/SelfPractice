package PracticeIt;

public class PrintPowers {
    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }
    public static void printPowersOf2(int number){
        int t = 1;
        for (int i = 0; i <= number; i++) {
            t = t * 2;
            System.out.print(t+ " ");
        }
        System.out.println();
    }
}
