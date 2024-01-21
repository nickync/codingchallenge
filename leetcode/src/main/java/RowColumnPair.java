import java.util.Arrays;

public class RowColumnPair {
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{
                {3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}
        }));
    }

    public static int equalPairs(int[][] grid) {
        int res = 0;

        for (int[] ints : grid) {
            int col = 0;
            while (col < grid.length) {
                int[] colVal = new int[grid.length];
                for (int j = 0; j < grid.length; j++) {
                    colVal[j] = grid[j][col];
                }
                col++;
                if (Arrays.equals(ints, colVal)) {
                    res++;
                }
            }
        }
        return res;
    }
}
