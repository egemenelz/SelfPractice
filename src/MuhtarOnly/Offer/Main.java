package MuhtarOnly.Offer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();


        offer1.setInfo("Miami", 120000, "SDET", true, true, false, true);
        offer2.setInfo("Savannah", 70000, "QA", true, true, true, false);
        offer3.setInfo("Dallas", 100000, "Scrum Master", false, false, true, false);
        offer4.setInfo("Gonen", 150000, "PO", true, true, true, true);

        ArrayList<Offer> localArea = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4));
        ArrayList<Offer> SDETnQA = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4));
        ArrayList<Offer> WFH = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4));
        ArrayList<Offer> hasBenefit = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4));
        ArrayList<Offer> isFullTime = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4));


        System.out.println("Offers in same local area");
        localArea.removeIf(p -> !p.location.equalsIgnoreCase("Miami"));
        for (Offer eachOffer1 : localArea) {
            eachOffer1.getInfo();
        }

        System.out.println("===================================");

        System.out.println("Only SDET and QA offers");
        SDETnQA.removeIf(p -> !p.jobTitle.equalsIgnoreCase("SDET") && !p.jobTitle.equalsIgnoreCase("QA"));
        for (Offer eachOffer2 : SDETnQA) {
            eachOffer2.getInfo();
        }

        System.out.println("===================================");

        System.out.println("Only Work From Home");
        WFH.removeIf(p -> !p.WFH);
        for (Offer eachOffer3 : WFH) {
            eachOffer3.getInfo();
        }

        System.out.println("===================================");

        System.out.println("Only Have Benefits");
        hasBenefit.removeIf(p -> !p.hasBenefit);
        for (Offer eachOffer4 : hasBenefit) {
            eachOffer4.getInfo();
        }


        System.out.println("===================================");

        System.out.println("Full Time'");
        isFullTime.removeIf(p -> !p.isFullTime);
        for (Offer eachOffer5 : isFullTime){
            eachOffer5.getInfo();
        }


    }
}
