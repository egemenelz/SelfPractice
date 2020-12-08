package PracticeIt;

public class countInRange {
    public static int countInRange(int[] numbers, int min, int max) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                while (numbers[i++] != max){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -31, -6, -5, -7, -9, -11, -15};
        System.out.println(countInRange(arr,-70, -3));
    }
}
