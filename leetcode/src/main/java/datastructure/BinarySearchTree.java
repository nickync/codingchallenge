package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinarySearchTree {
    private Node root;
    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public boolean insert( int value ){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        // compare left and right and insert to null

        return true;
    }

    public ArrayList<Integer> bfs(){
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<Node> q = new LinkedList<>();
        Node node = root;
        q.push(node);
        while (q.size() > 0){
            Node cur = q.poll();
            res.add(cur.value);
            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
        }
        return res;

    }
}

class SolutionBST{

}
