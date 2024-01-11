import java.util.Arrays;
import java.util.List;

public class leetcode {
    public static void main(String[] args) {
        System.out.println( reverseVowels("e.a") );
        String s = "asf";
        char[] s1 = s.toCharArray();
        int[] r = new int[]{1,2};
        List<Integer> res = new java.util.ArrayList<>(Arrays.stream(r).boxed().toList());
        res.remove(1);
    }

    public static String reverseVowels(String s) {
        //List<Character> vo = Arrays.asList('a','e','i','o','u');
        StringBuilder ss = new StringBuilder();
        char[] cs = s.toCharArray();
        int k = cs.length-1;
        for ( int i=0; i < cs.length; i++) {
            if ( isVowel(cs[i]) ){
                while ( !isVowel( cs[k]) & k >= 0){
                    k = k - 1;
                }
                ss.append(cs[k]);
                k = k -1;
            } else {
                ss.append( cs[i] );
            }
        }
        return ss.toString();
    }

    public static boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
