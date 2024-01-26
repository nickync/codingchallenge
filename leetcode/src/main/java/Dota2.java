import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dota2 {

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("DRRDRDRDRDDRDRDR"));
        System.out.println(predictPartyVictory("RDD"));
        System.out.println(predictPartyVictory("DDRRR"));
    }

    public static String predictPartyVictory(String senate) {

        int count = 0;
        char[] cs = senate.toCharArray();
        boolean kk = true;
        Queue<Character> request = new LinkedList<>();
        List.of(senate.toCharArray()).stream().forEach(i -> request.offer(i));
        request.offer(cs[0]);
        while (request.contains('R') & request.contains('D')){
            for (char c : cs){
                if (request.size() == 0){
                    request.offer(c);
                    continue;
                }
                if (request.peek() == c){
                    request.offer(c);

                } else if (count > 0){
                    count --;
                    request.offer(c);

                    continue;
                }  else {
                    count ++;
                }
            }
        }


        return request.peek() == 'R' ? "Radiant" : "Dire";
    }
}
