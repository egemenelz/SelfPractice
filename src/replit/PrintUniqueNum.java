package replit;

public class PrintUniqueNum {
    public static void main(String[] args) {
        int[] arr ={2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNumbers(arr);
    }
    public static void printUniqueNumbers(int[] nums){

        for (int each : nums){
            int count = 0;
            for (int each1 : nums ){
                if (each == each1){
                    count++;
                }
            }if (count == 1){
                System.out.println(each);
            }
        }
    }
}
