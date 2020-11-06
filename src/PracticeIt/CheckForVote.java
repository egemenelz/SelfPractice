package PracticeIt;

public class CheckForVote {
    public static void main(String[] args) {
        String name1 = "John";
        String citizenship1 = "USA";

        String name2 = "Jimmy";
        String citizenship2 = "Korea";

        boolean isEligible = citizenship1 == "USA";

        System.out.println(name1 + " is eligible to vote for Donald Trump or Joe Biden?");
        System.out.println(isEligible);

        isEligible =citizenship2=="USA";
        System.out.println(name2 + " is eligible to vote for Donald Trump or Joe Biden?");
        System.out.println(isEligible);
    }
}
