package day04;

public class SelfPractice {
    public static final int LINES = 5;

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }



    public static void drawTop(){
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int dots = (6 - 2 * line);
            for (int i = 1; i <= dots; i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void drawBottom(){

        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) {
                System.out.print(".");
            }
            System.out.print("\\");

            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }



    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();


        /*int squared =0;  // declaration is now in outer scope
        for (int i = 1; i <= 5; i++) {
            squared = i * i;  // change this to an assignment statement
            System.out.println(i + " squared = " + squared); }

        System.out.println("Last square = " + squared);*/

        /*int i;
        for (i = 1; i <= 10; i++) {
            for (i = 1; i <= 5; i++)
            { System.out.println("hi there.");
            } }*/

        /*for (int line = 3; line >= 1 ; line--) {
            for (int i = 1; i <= (line -1) ; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (7-2 * line) ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for (int line = LINES; line >=1 ; line--) {
            for (int i = 1; i <=(line - 1); i++) {
                System.out.print(" ");
            }
            int stars = 2 * LINES + 1 - 2 * line;
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



    }
}
