package datastructure;

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
}

class SolutionBST{

}
