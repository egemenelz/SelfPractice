package day04;

public class LittersToGallon {
    public static void main(String[] args) {
        int litters = 20;
        double gallon = 3.785;
        double littersToGallon = litters / gallon;
        System.out.println(littersToGallon);

        int propertyPrice = 0;
        for (int i = 1; i <= 5; i++) {
            propertyPrice += 20000;
            System.out.println("propertyPrice = " + propertyPrice);
        }
        System.out.println("propertyPrice = " + propertyPrice);
    }
}
