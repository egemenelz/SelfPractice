package replit;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;

        String word = scan.next();
        String temp = word;
        while (temp.contains("cat")){
            temp = temp.replaceFirst("cat","");
            countOfCats++;
        }
        while(temp.contains("dog")){
            temp = temp.replaceFirst("dog","");
            countOfDogs++;
        }

        System.out.println(countOfCats == countOfDogs);
    }
}
