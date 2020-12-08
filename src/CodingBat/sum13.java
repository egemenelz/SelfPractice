package CodingBat;

public class sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 13) {
                    ++i;
                    continue;
                }
                sum += nums[i];
            }
            return sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 13, 2, 1, 13};
        System.out.println(sum13(nums));
    }
}
