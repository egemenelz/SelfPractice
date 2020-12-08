package CodingBat;

public class has271 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 8, 0};
        System.out.println(has271(arr));
    }

    public static boolean has271(int[] nums) {

//        for (int i = 0; i < nums.length-2; i++) {
//            int first = nums[i];
//            if (nums[i + 1] == first + 5 && (nums[i+2] == first - 1 || nums[i+2] == first -2 || nums[i+2] == first +2)) {
//                return true;
//            }
//        }return false;
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&              // the "7" check
                    Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
                return true;
            }
        }return false;

    }
}
