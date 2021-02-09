
public class Str {
    public static void main(String[] args){
        int nums[] = {1,2};
        System.out.println(double23(nums));
    }
    public static boolean double23(int[]nums){

        /*if(nums.length < 2 ){
            return false;
        }else if( (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)){
            return true;
        }
        return false;*/

        if (nums.length > 1){
            boolean twoTwice = nums[0] == 2 && nums[1] == 2;
            boolean threeTwice = nums[0] == 3 &&  nums[1] == 3;
            if (twoTwice || threeTwice){
                return true;
            }
        }return false;

    }
}
