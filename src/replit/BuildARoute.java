package replit;

import java.util.Scanner;

public class BuildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();


        if (start.equalsIgnoreCase("a")&&end.equalsIgnoreCase("b")){
            System.out.println("right: B found");
        }else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("c")){
            System.out.println("right > down: C found");
        }else if (start.equalsIgnoreCase("a") && end.equalsIgnoreCase("d")){
            System.out.println("right > down > left: D found");
        }else if (start.equalsIgnoreCase("b")&&end.equalsIgnoreCase("a")){
            System.out.println("down > left > up: A found");
        }else if (start.equalsIgnoreCase("b")&&end.equalsIgnoreCase("c")){
            System.out.println("down: C found");
        }else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("d")){
            System.out.println("down > left: D found");
        }else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("d")){
            System.out.println("left: D found");
        }else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("a")){
            System.out.println("left > up: A found");
        }else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("b")){
            System.out.println("left > up > right: B found");
        }else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("a")){
            System.out.println("up: A found");
        }else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("b")){
            System.out.println("up > right: B found");
        }else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("c")){
            System.out.println("up > right > down: C found");
        }else if (start.equalsIgnoreCase(end)){
            System.out.println(start+ " found");
        }
    }
}
