package replit;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String java = "java";
        String python = "python";

        int countJava = 0;
        int countPython = 0;

        while (sentence.contains("java")){
            sentence = sentence.replaceFirst(java,"");
            countJava++;
        }
        while (sentence.contains("python")){
            sentence = sentence.replaceFirst(python,"");
            countPython++;
        }
        System.out.println(countJava == countPython);



    }
}
