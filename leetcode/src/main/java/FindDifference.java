import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDifference {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 9ms 
        HashMap<Integer, Integer> ls1 = new HashMap<>();
        HashMap<Integer, Integer> ls2 = new HashMap<>();
            for (int n:nums1){
            ls1.put(n, 1);
        }
            for (int n:nums2){
            ls2.put(n,1);
        }
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
            for (Integer i : ls1.keySet()){
            if (!ls2.containsKey(i)){
                ans1.add(i);
            }
        }
            for (Integer i : ls2.keySet()){
            if(!ls1.containsKey(i)){
                ans2.add(i);
            }
        }
            return Arrays.asList(ans1, ans2);
}
//    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> ls1 = new HashMap<>();
//        HashMap<Integer, Integer> ls2 = new HashMap<>();
//
//        for (int n:nums1){
//            ls1.put(n, 1);
//        }
//        for (int n:nums2){
//            ls2.put(n,1);
//        }
//
//        List<Integer> ans1 = new ArrayList<>();
//        List<Integer> ans2 = new ArrayList<>();
//        for (Integer i : ls1.keySet()){
//            if (!ls2.containsKey(i)){
//                ans1.add(i);
//            }
//        }
//        for (Integer i : ls2.keySet()){
//            if(!ls1.containsKey(i)){
//                ans2.add(i);
//            }
//        }
//        List<List<Integer>> res = new ArrayList<>(){};
//        res.add(ans1);
//        res.add(ans2);
//        return res;
//    }

//    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> ls1 = new HashMap<>();
//        HashMap<Integer, Integer> ls2 = new HashMap<>();
//
//        for (int n:nums1){
//            ls1.put(n, 1);
//        }
//        for (int n:nums2){
//            ls2.put(n,1);
//        }
//
//        List<List<Integer>> res = new ArrayList<>();
//
//        res.add( ls1.keySet().stream().distinct().filter(i -> !ls2.containsKey(i)).toList() );
//        res.add( ls2.keySet().stream().distinct().filter(i -> !ls1.containsKey(i)).toList() );
//
//        return res;
//    }
//-------------------
//    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        List<List<Integer>> res = new ArrayList<>();
//        HashMap<Integer, Integer> ls1 = new HashMap<>();
//        HashMap<Integer, Integer> ls2 = new HashMap<>();
//
//        for (int n : nums1){
//            if (ls1.containsKey(n)){
//                ls1.put(n, ls1.get(n) + 1);
//            } else {
//                ls1.put(n, 1);
//            }
//        }
//
//        for (int n : nums2){
//            if (ls2.containsKey(n)){
//                ls2.put(n, ls2.get(n) + 1);
//            } else {
//                ls2.put(n, 1);
//            }
//        }
//
//        List<Integer> ans1 = ls1.keySet().stream().filter(i -> !ls2.containsKey(i)).toList();
//        List<Integer> ans2 = ls2.keySet().stream().filter(i -> !ls1.containsKey(i)).toList();
//
//        res.add(ans1);
//        res.add(ans2);
//
//        return res;
//    }
}
