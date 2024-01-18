public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,1,-1}));
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    public static int pivotIndex(int[] nums) {

        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        int left =0;
        int right=sum;

        for (int i=0; i<nums.length; i++){
            right -= nums[i];
            if (left == right){
                return i;
            }
            left += nums[i];
        }

        return -1;

    }
}
