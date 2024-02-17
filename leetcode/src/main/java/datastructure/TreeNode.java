package datastructure;

import java.util.HashMap;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode () {};
    TreeNode (int val){ this.val = val; }
    TreeNode (int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode();
        TreeNode t2 = new TreeNode();
        TreeNode t3 = new TreeNode();
        TreeNode t4 = new TreeNode();
        TreeNode t5 = new TreeNode();
        TreeNode t6 = new TreeNode();
        TreeNode t7 = new TreeNode();
        TreeNode t8 = new TreeNode();
        TreeNode t9 = new TreeNode();
        t1.val = 10;
        t1.left = t2;
        t2.val = 5;
        t1.right = t3;
        t3.val = -3;
        t2.left = t4;
        t4.val = 3;
        t2.right = t5;
        t5.val = 2;
        t3.right = t6;
        t6.val = 11;
        t4.left = t7;
        t7.val = 3;
        t4.right = t8;
        t8.val = -2;
        t5.right = t9;
        t9.val = 1;


        System.out.println(path(t1, 0));
    }

    static HashMap<Integer, Integer> map = new HashMap<>();
    static int count = 0;
    public static int path( TreeNode root, int targetSum){
        count(root,0,targetSum);
        return count;
    }

    public static void count( TreeNode root, int sum, int target ){
        if (root == null) return;

        sum += root.val;

        if (sum == target){
            count ++;
        }

        count += map.getOrDefault(sum - target, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);

        count(root.left, sum, target);
        count(root.right, sum, target);

//        map.put(sum, map.getOrDefault(sum, 0) - 1);
    }
}
