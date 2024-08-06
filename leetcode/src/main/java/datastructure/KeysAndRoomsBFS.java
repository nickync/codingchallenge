package datastructure;

import java.util.*;

public class KeysAndRoomsBFS {

    public static void main(String[] args) {
        List<List<Integer>> rooms = new LinkedList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));

        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> keys = new LinkedList<>();

        Set<Integer> uniqueKeys = new HashSet<>();
        uniqueKeys.add(0);
        for (Integer key : rooms.get(0)){
            keys.offer(key);
        }
        while (!keys.isEmpty()){
            Integer key = keys.poll();

            if (!uniqueKeys.contains(key)){
                for (Integer k : rooms.get(key)){
                    keys.offer(k);
                }
            }
            uniqueKeys.add(key);
        }
        return uniqueKeys.size() == rooms.size();
    }
}
