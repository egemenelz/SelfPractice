package MuhtarOnly;

import java.util.Scanner;

public class CurvePercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Class Curve Percentage");
        double curve = sc.nextDouble();


        System.out.println("Did you get extra credit");
        boolean extraCredit = sc.hasNextBoolean();

        if (curve < 0 && curve > 100 ){
            System.out.println("Invalid Curve");
        }





    }
}
