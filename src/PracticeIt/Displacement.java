package PracticeIt;

public class Displacement {
    public static void loopSquares(){
        int num = 0;
        for (int i = 1; i < 20 ; i+=2) {
            num += i;
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        loopSquares();

       /* double s0 = 12.0;
        double v0 = 3.5;
        double a = 9.8;
        int t = 10;
        double s = s0 + v0 * t + .5 * a * t * t;
        System.out.println(s);*/

        /*int a = 1;
        int b = 0;
        int c;

        for (int i = 0; i < 7; i++) {
            System.out.print(a +" ");
            c = a + b;
            b = a;
            a = c;
        }*/

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 6 - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }
        System.out.println("+++++++++++++++++++++++++");
        for (int i = 1; i <=40; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int i = 1; i <=2 ; i++) {
            System.out.print("11223344556677889900");
        }
        System.out.println();
        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
        System.out.println();



        
    }
}
