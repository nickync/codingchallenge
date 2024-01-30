import java.util.LinkedList;
import java.util.Queue;

public class Dota2 {

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("DRRDRDRDRDDRDRDR"));
        System.out.println(predictPartyVictory("RDD"));
        System.out.println(predictPartyVictory("DDRRR"));
    }

    public static String predictPartyVictory(String senate) {
        char[] cs = senate.toCharArray();
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();

        for (int i=0; i< cs.length; i ++){
            if (cs[i] == 'R'){
                r.offer(i);
            } else {
                d.offer(i);
            }
        }

        while (!r.isEmpty() & !d.isEmpty()){
            int ra = r.poll();
            int di = d.poll();
            if (ra < di){
                r.offer(ra + cs.length);
            } else {
                d.offer(di + cs.length);
            }
        }


        return r.isEmpty() ? "Dire" : "Radiant";
    }
}
