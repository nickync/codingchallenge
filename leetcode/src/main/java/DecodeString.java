public class DecodeString {
    public static void main(String[] args) {
//        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("2[abc]3[cd]ef"));
        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
//        System.out.println(decodeString("100[leetcode]"));
//        System.out.println(decodeString("leetcode"));
    }

    public static String decodeString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int mul = 1;
        int start = 0;
        int end = s.length();
        StringBuilder num = new StringBuilder();

        if (!s.contains("[")){
            return s;
        }

        for ( int i = 0; i < chars.length; i ++){
            if (chars[i] == ']'){
                end = i;
                break;
            }
        }

        for (int i = end; i >=0; i --){
            if (chars[i] == '[' & num.length() == 0){
                start = i;
            } else if (Character.isDigit(chars[i])){
                num.insert(0, chars[i]);
            } else if (Character.isAlphabetic(chars[i]) & num.length() > 0){
                break;
            } else if (chars[i]=='[' & num.length() > 0){
                break;
            }
        }

        int repeat = Integer.parseInt(num.toString());

        while (repeat > 0){
            for (int i = end -1; i > start; i--){
                res.insert(0,chars[i]);
            }
            repeat --;
        }

        res.insert(0, s.substring(0, start - num.length()));
        res.append(s.substring(end+1));

        return decodeString(res.toString());
    }
}
