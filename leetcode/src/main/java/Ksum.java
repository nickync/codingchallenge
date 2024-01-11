import java.util.Arrays;
import java.util.List;

public class Ksum {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 2));
    }

    public static int maxOperations(int[] nums, int k) {
        List<Integer> res = new java.util.ArrayList<>(Arrays.stream(nums).boxed().toList());
        int j = 0;
        int count = 0;

        while (j<res.size()-1){
            int l = res.size();
            for (int i=j+1; i<res.size();i++){
                if (res.get(j) + res.get(i) == k){
                    count ++;
                    res.remove(i);
                    res.remove(j);
                }
            }
            if (res.size() == l){
                j ++;
            }
        }
        return count;
    }
}
