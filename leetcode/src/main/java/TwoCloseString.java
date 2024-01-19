import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TwoCloseString {
    public static void main(String[] args) {
//        System.out.println(closeStrings("abc", "bca"));
        System.out.println(closeStrings("cabbba", "abbccc"));
    }

    public static boolean closeStrings(String word1, String word2) {
//        Hashtable<Character, Integer> s1 =
        if (word1.length() != word2.length()){
            return false;
        }

        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();

        TreeMap<Character, Integer> t1 = new TreeMap<>();
        for (char c : s1){
            t1.put(c, t1.getOrDefault(c, 0) + 1);
        }

        TreeMap<Character, Integer> t2 = new TreeMap<>();
        for (char c : s2){
            t2.put(c, t2.getOrDefault(c, 0) + 1);
        }
//        System.out.println(t1.keySet().equals(t2.keySet()));
        List<Integer> values1 = new ArrayList<>(t1.values());
        List<Integer> values2 = new ArrayList<>(t2.values());
        Collections.sort(values1);
        Collections.sort(values2);
        return t1.keySet().equals(t2.keySet()) & values1.equals(values2);
    }
}
