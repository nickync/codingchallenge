import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,1, 0 , 3 ,12})));
    }

    public static int[] moveZeroes(int[] nums) {
        int k = 0;
        for (int i=0; i< nums.length; i ++){
            if (nums[i] != 0){
                nums[k] = nums[i];
                if (i != 0){
                    nums[i] = 0;
                }

                k ++;
            }
        }
    return nums;
    }

}
