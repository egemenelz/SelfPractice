package UdemyCourse;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1 , int num2, int num3){

        if ((num1 >= 10 &&  num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)){

            int firstRight = num1 % 10;
            int secondRight = num2 % 10;
            int thirdRight = num3 % 10;

            if ((firstRight == secondRight) || (firstRight == thirdRight)||(secondRight == thirdRight)){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
        
    }
    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(99,19,59));
        System.out.println(isValid(9));
    }
}
