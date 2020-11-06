package UdemyCourse;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int lastDigit = 0;
        int sum = 0;
        if (number < 0){
            return -1;
        }
        lastDigit = number % 10;
        while (number >= 10){
            number = number / 10;
        }sum = number +lastDigit;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(22));
    }
}
