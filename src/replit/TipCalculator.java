package replit;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalPay = 0;
        double totalTip = 0;
        double totalPerPerson = 0;
        double tipPerson = 0;

        System.out.println("Split:");
        String split = scan.nextLine();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double amountOfPay = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        switch (numberOfPeople){
            case 1:
                System.out.println("Number of people entered: &");
                break;
            case 2:
                System.out.println("Number of people entered: &&");
                break;
            case 3:
                System.out.println("Number of people entered: &&&");
                break;
            case 4:
                System.out.println("Number of people entered: &&&&");
                break;
            case 5 :
                System.out.println("Number of people entered: &&&&&");
                break;
        }

        if (split.equalsIgnoreCase("yes")){
            if (serviceQuality.equalsIgnoreCase("poor")){
                totalTip = amountOfPay * 0.05;
                totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("fair")){
                totalTip = amountOfPay * 0.10;
                totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("good")) {
                totalTip = amountOfPay * 0.15;
                totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("great")){
                    totalTip = amountOfPay * 0.20;
                    totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("excellent")){
                totalTip = amountOfPay * 0.25;
                totalPay = totalTip + amountOfPay;
            }
            totalPerPerson =totalPay / numberOfPeople;
            tipPerson = totalTip / numberOfPeople;

        }else{
            if (serviceQuality.equalsIgnoreCase("poor")){
                totalTip = amountOfPay * 0.05;
                totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("fair")){
                totalTip = amountOfPay * 0.10;
                totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("good")){
                totalTip = amountOfPay * 0.15;
                totalPay = totalTip + amountOfPay;
            }else if (serviceQuality.equalsIgnoreCase("great")){
                totalTip = amountOfPay * 0.20;
                totalPay = totalTip + amountOfPay;
            }
            else if (serviceQuality.equalsIgnoreCase("excellent")){
                totalTip = amountOfPay * 0.25;
                totalPay = totalTip + amountOfPay;
            }
        }


        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerson);



    }
}
