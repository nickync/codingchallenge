public class sliding1 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {

        double max = 0.0;
        double sum = 0.0;
        double res = Integer.MIN_VALUE;
        if (nums.length==1){
            return nums[0];
        }
        for (int j = 0; j < k; j++) {
            sum += nums[j];
            max = sum;
        }
        if (nums.length==k){
            return sum/k;
        }

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        return max / k;
    }

//        double sum = 0.0;
//        double res = Integer.MIN_VALUE;
//        int i = 0;
//        while (i + k <= nums.length){
//            for ( int j=0; j < k; j ++){
//                sum += nums[j+i];
//            }
//            if (sum / k > res){
//                res = sum / k;
//            }
//            i ++;
//            sum = 0;
//        }
//        return res;
//    }
}
