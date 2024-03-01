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

    public ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> res = new ArrayList<>();

        class Traverse{
            public Traverse(Node node){

                res.add(node.value);

                if (node.left != null){
                    new Traverse(node.left);
                }
                if (node.right != null){
                    new Traverse(node.right);
                }
            }
        }

        Traverse t = new Traverse(root);
        return res;
    }

    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            public Traverse(Node node){
                if (node.left != null){
                    new Traverse(node.left);
                }
                if (node.right != null){
                    new Traverse(node.right);
                }
                results.add(node.value);
            }
        }
        Traverse t = new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    public boolean isValidBST(){
        ArrayList<Integer> res = DFSInOrder();
        for (int i = 0; i < res.size() - 1; i ++ ){
            if (res.get(i) > res.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}

class SolutionBST{

}
