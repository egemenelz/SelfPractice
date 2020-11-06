package PracticeIt;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int sum = 0;
        int temp;

        temp = number;


        while (number > 0){
            reverse = number % 10;
            sum = (sum * 10) + reverse;
            number = number / 10;
        }
        if(temp == sum){
            return true;
        }else{
            return false;
        }
    }
}
