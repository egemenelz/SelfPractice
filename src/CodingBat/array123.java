package CodingBat;

public class array123 {
    public static void main(String[] args) {

        int arr[] ={1, 1, 2, 1, 3};
        System.out.println(array123(arr));
    }

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                if (nums[i+1] == 2){
                    if (nums[i+2] == 3){
                        return true;
                    }
                }
            }
        }return false;
    }
}
