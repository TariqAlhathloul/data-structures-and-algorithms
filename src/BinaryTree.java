// A binary tree is a tree data structure in which each node can have at most two children,
// which are referred to as the left child and the right child.
class Node{
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }

}

public class BinaryTree {
    Node root;
    public BinaryTree(int key) {
        root = new Node(key);
    }
    public BinaryTree() {
        root = null;
    }

    // the tree would look like this
    /*
     *           1
     *          / \
     *         2   4
     *        /  \
     *       3     5
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(5);
    }
}
