package replit;

import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = sc.nextInt();
        int nonSeniorCitizens = sc.nextInt();

        System.out.println("What is new citizen's age?");
        int age = sc.nextInt();

        if(age >= 65){
            seniorCitizens++;
            System.out.println("Senior Citizen");
        }else{
            nonSeniorCitizens++;
            System.out.println("Non-Senior Citizen");
        }
        System.out.println("New seniorCitizens count "+seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
    }
}
