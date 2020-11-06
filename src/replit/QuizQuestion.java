package replit;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        s.close();

        if (a.equals("a") || a.equals("c")){
            System.out.println(a +" is wrong");
        }else if (a.equals("b")){
            System.out.println("b is correct");
        }else{
            System.out.println(a+" is not a valid answer");
        }





    }
}
