package replit;

public class CountEvens {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4};


        int count =0;
        for (int i = 0; i < nums.length ; i++) {
            int eachNumber = nums[i];
            if (eachNumber % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
