package PracticeIt;

public class HailStone {
    public static void printHailStoneMaxMin(int value, int length){
        int min = value;
        int max = value;

        for (int i = 1; i < length - 1 ; i++) {
            if (value % 2 == 0){
                value /= 2;
            }else {
                value = 3 * value + 1;
            }
            if (value > max){
                max = value;
            }else if(value < min){
                min = value;
            }
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }

    public static void main(String[] args) {
        printHailStoneMaxMin(7,20);
    }
}
