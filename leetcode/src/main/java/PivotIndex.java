public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums) {
        int left =0;
        int right=nums.length-1;
        int sum1=0;
        int sum2=0;
        int ind = -1;
        while (right > left){
            sum1 += nums[left];
            sum2 += nums[right];
            if (sum1 > sum2){
                right ++;
            } else if (sum1 < sum2){
                left ++;
            } else {
                left ++;
                right--;
            }
            if (sum1 == sum2){
                ind = right;
            }
        }
        return sum1 == sum2 ? right : -1;
    }
}
