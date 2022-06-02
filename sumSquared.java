// return sum of squared in an array

public class Kata
{
  public static int squareSum(int[] n)
  { 
   int res = 0;
     for (int i=0;i<n.length;i++){
       res += n[i]*n[i];
     }
    return res;
  }
}

// Best

import java.util.Arrays;

public class Kata {
  public static int squareSum(int[] xs) {
    return Arrays.stream(xs).map(x -> x * x).sum();
  }
}