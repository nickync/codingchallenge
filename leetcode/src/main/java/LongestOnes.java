public class LongestOnes {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1}, 2));
    }

    public static int longestOnes(int[] nums, int k) {

        int max = 0;
        int zero = 0;
        int left = 0;
        for (int i=0; i < nums.length; i++){
            if (nums[i] == 0){
                zero ++;
                while (zero > k){
                    if (nums[left] == 0){
                        zero --;
                    }
                    left ++;
                }
            }
            max = Math.max( max, i-left+1);
        }
        return max;
    }
}
