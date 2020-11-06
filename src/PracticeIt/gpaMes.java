package PracticeIt;

public class gpaMes {
    public static void main(String[] args) {
        double gpa = 4.0;
        double diff = Math.abs(gpa * 3 - 9.6);
        if (diff < 0.1) {
            System.out.println("You earned enough credits.");
        }

    }
}
