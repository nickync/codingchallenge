import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{1,-1,-2,-2})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8, -8})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> remain = new Stack<>();

        for (int i : asteroids){
            if (remain.size()==0){
                remain.push(i);
                continue;
            }
            if (remain.peek() < 0){
                remain.push(i);
                continue;
            }
            if (i < 0 & remain.peek() < Math.abs(i)){
                remain.push(i);
            } else if ( i < 0 & remain.peek() == Math.abs(i)){
                remain.pop();
            } else if (i > 0){
                remain.push(i);
            }
        }

        int[] res = new int[remain.size()];
        for (int i=remain.size()-1; i >= 0; i--){
            res[i] = remain.pop();
        }

        if (res.length == asteroids.length){
            return res;
        }

        return asteroidCollision(res);
    }
}
