package MuhtarOnly;

import java.util.Scanner;

public class UniqueAndDuplicateStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String unique = "";
        String duplicate = "";


        System.out.println("How many words?");
        int length = scan.nextInt();

        String[] arrString = new String[length];

        System.out.println("Enter "+ length +" strings");
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = scan.next();
        }
        scan.close();
        for (int i = 0; i < arrString.length; i++) {
            String eachString = arrString[i];
            int count = 0;
            for (int j = 0; j < arrString.length; j++) {
                if (arrString[j].equals(eachString)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += eachString+" ";
            } else {
                if (!duplicate.contains(eachString)) {
                    duplicate += eachString + " ";
                }
            }

        }
        System.out.println("Unique : " + unique);
        System.out.println("Duplicate : " + duplicate);

    }
}
