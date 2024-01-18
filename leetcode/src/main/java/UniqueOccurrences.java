import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int n: arr){
            res.put(n, res.getOrDefault(n, 0) + 1);
        }
        Set<Integer> val = new HashSet<>(res.values());
        return val.size() == res.size();
    }
}
