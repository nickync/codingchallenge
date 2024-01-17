import java.util.Arrays;

public class LongestSubarray {
    public static void main(String[] args) {
        //System.out.println(longestSubarray(new int[]{1,1,1,0,1,1,1,0,1,1,1,1,1}));
        //System.out.println(longestSubarray(new int[]{1,1,1}));
        int[] s = new int[]{20,151,20,440,20,180,195,429,20,252,15,180,185,185,185,185};
        System.out.println(Arrays.stream(s).sum());
        System.out.println(Arrays.stream(s).sum() / 4.0);
    }

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int zero = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            }
            while (zero > 1) {
                if (nums[left]==0){
                    zero --;
                }
                left ++;
            }
            res = Math.max(res, i - left);
        }

        return res;
    }
}
