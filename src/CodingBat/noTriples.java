package CodingBat;

public class noTriples {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 1};
        System.out.println(noTriples(arr));
    }

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length-2 ; i++) {
            int first = nums[i];
            if (nums[i+1] == first && nums[i+2] == first){
                return false;
            }
        }return true;
    }
}