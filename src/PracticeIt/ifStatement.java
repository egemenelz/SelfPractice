package PracticeIt;

public class ifStatement {
    public static void main(String[] args) {
        String name = "James";
        int age = 19;

        if (age >= 21){
            System.out.println(name + " is eligible to buy a alcohol");
        }else if(age < 21){
            System.out.println(name + " is not eligible to buy a alcohol.");
        }

        name = "John";
        String citizenship = "USA";

        if (citizenship == "USA"){
            System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden ?");
        }
    }
}
