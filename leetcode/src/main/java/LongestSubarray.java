public class LongestSubarray {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }

    public static int longestSubarray(int[] nums) {
        int res = 0;
        int max = 0;
        int del = 1;
        for (int i =0; i <nums.length; i++){
            if (nums[i] == 1){
                res ++;
            } else {
                if (del == 1){

                    del = 0;
                } else {
                    max = res;
                    del = 1;
                    res = 0;
                }
            }
        }
        return res;
    }
}
