public class MaxVowels {
    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }

    public static int maxVowels(String s, int k) {
        char[] ss = s.toCharArray();

        int res = 0;
        int m = 0;

        for ( int i=0; i < k; i++ ){
            if (ss[i] == 'a' |ss[i] == 'e' |ss[i] == 'i' |ss[i] == 'o' |ss[i] == 'u' )             {
                res ++;
                m = res;
            }
        }

        for (int i=k; i < ss.length; i++){
            if (ss[i] == 'a' |ss[i] == 'e' |ss[i] == 'i' |ss[i] == 'o' |ss[i] == 'u' ) {
                if ( res < k){
                    res ++;
                }
            }
            if (ss[i-k] == 'a' |ss[i-k] == 'e' |ss[i-k] == 'i' |ss[i-k] == 'o' |ss[i-k] == 'u' & res>0) {
                res --;
            }
            if (res > m){
                m = res;
            }
        }
        return m;
    }
}
