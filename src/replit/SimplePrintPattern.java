package replit;

public class SimplePrintPattern {
    public static void main(String[] args) {
        printHoolowRect();
    }

    public static void printHoolowRect() {
        System.out.print("*****");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print("*****");
    }
}
