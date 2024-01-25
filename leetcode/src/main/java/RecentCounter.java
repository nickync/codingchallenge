import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private Queue<Integer> requests;

    public RecentCounter() {
        this.requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (t - requests.peek() > 3000){
            requests.poll();
        }
        return requests.size();
    }
}
