import java.util.ArrayList;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        String [] re = s.strip() .split(" ");
        ArrayList<String> r1 = new ArrayList<>();
        for (int i=re.length-1; i >= 0; i--) {
            if (re[i].replace(" ", "").length()>0){
                r1.add( re[i] );
            }
        }
        return String.join(" ", r1);
    }
}
