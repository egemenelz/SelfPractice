package PracticeIt;

public class BuyAlcohol {
    public static void main(String[] args) {

        String name1 = "James";
        String name2 = "Aaron";
        int age = 19;
        int age2= 39;

        boolean isBuyAlcohol = age > 21;
        System.out.println(name1 + " is eligible to buy alcohol ?");
        System.out.println(isBuyAlcohol);

        isBuyAlcohol = age2 > 21;
        System.out.println(name2 + " is eligible to buy alcohol ?");
        System.out.println(isBuyAlcohol);
    }
}
