package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapQ {
    public static List<List<String>> groupAnagrams(String[] strings){
        HashMap<String, List<String>> map = new HashMap<>();
        String found = null;
        for (int i = 0; i < strings.length; i ++){
            if (map.keySet().size() == 0){
                map.put(strings[i], new ArrayList<String>());
                continue;
            }
            for (String key : map.keySet()){

                for (int j = 0; j < strings[i].length(); j ++){
                    if (!key.contains(strings[i].substring(j, j+1))){
                        break;
                    } else if ( j == strings[i].length() - 1){
                        found = key;
                    }
                }
            }

            if (found != null){
                var list = map.getOrDefault(found, new ArrayList<String>());
                list.add(strings[i]);
                map.put( found, list);
                found = null;
            } else {
                map.put(strings[i], new ArrayList<String>());
            }
        }
        List<Integer> res = new ArrayList<>();
        String r = "rser";
        r.length()
    }


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{" ", " ", "  ", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }
}

