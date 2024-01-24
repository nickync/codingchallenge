import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();

        for (char c : str){
            if (c == '*'){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        stack.forEach(res::append);
        return res.toString();
    }
}
