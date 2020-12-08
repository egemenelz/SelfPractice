package CodingBat;

public class sum67 {
    public static int sum67 (int[] nums){
        int sum = 0;
        boolean flag = true;
        if(nums.length >  1){
            for (int i = 0; i < nums.length ; i++) {
                if (nums[i] == 6){
                    flag = false;
                }
                if (flag == true){
                    sum += nums[i];
                }
                if (nums[i] == 7){
                    flag = true;
                }
            }return sum;
        }return 0;
    }
    //1, 6, 2, 2, 7, 1, 6, 99, 99, 7 -->

    public static void main(String[] args) {

        int nums [] = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(sum67(nums));
    }
}
