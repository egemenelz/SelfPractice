package UdemyCourse;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum , int secondNum){

        if ((firstNum >= 10 && secondNum >=10)&&(firstNum <= 99 && secondNum <= 99)){

            int firstLeftside = firstNum /10;
            int firstRightside = firstNum % 10;
            int secondLeftside = secondNum / 10;
            int secondRightside = secondNum % 10;

            if((firstLeftside  == secondLeftside) ||(firstLeftside == secondRightside)|| (firstRightside == secondRightside) ||(firstRightside == secondLeftside)){

                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,99));

    }
}
