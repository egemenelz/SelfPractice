package PracticeIt;

public class NumbersOutPut {
    public static final int RANGE = 10;
    public static final int REPETITIONS = 6;

    public static void main(String[] args) {
        for (int n = 1; n <=REPETITIONS ; n++) {
            for (int i = 1; i <RANGE; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int i =1; i<=REPETITIONS; i++) {
            System.out.print(RANGE);
        }

    }
}
