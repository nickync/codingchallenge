public class Triplet {
    public static void main(String[] args) {
        //System.out.println(increasingTriplet(new int[]{20,100,10,12,5,1}));
        System.out.println(increasingTriplet(new int[]{5,1,6}));
    }

    public static boolean increasingTriplet(int[] nums) {

        int sm = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] <= sm){
                sm = nums[i];
            } else if (nums[i] <= mid) {
                mid = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}
