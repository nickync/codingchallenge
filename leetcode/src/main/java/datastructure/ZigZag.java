package datastructure;

public class ZigZag {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
  }

    class Solution {
        int max = 0;

        public int longestZigZag(TreeNode root) {
            if (root == null) return -1;
            travel(root, 0, true);
            travel(root, 0, false);
            return max;
        }

        public void travel(TreeNode node, int sum, boolean right) {
            if (node == null) {
                return;
            }

            max = Math.max(max, sum);

            if (right) {
                travel(node.left, sum + 1, false);
                travel(node.right, 1, true);
            } else {
                travel(node.right, sum + 1, true);
                travel(node.left, 1, false);
            }
        }
    }
}