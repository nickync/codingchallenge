public class product {

    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int index = 0;
        for (int i=0; i<nums.length;i++){
            int pro = 1;
            while (index < nums.length) {
                if(index != i){
                    pro = pro * nums[index];
                }
                index ++;
            }
            res[i] = pro;
        }
        return res;
    }
}
