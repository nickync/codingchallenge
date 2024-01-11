public class Compress {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','b','c'}));
//          System.out.println(compress(new char[]{'a'}));
    }

    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int k = 1;

        for (int i=0; i < chars.length-1; i++){
            if (chars[i] == chars[i+1]){
                k ++;
            } else {
                s.append(chars[i]);
                if (k != 1){
                    s.append(k);
                }
                k = 1;
            }
        }

        s.append(chars[chars.length-1]);
        if (k != 1){
            s.append(k);
        }

        char[] res = s.toString().toCharArray();
        for (int i=0; i<res.length ; i++ ){
            chars[i] = res[i];
        }
        return chars.length;
    }
}
