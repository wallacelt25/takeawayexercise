//Write a function that coutns the number of items in a binary tree
public class BinaryTree {
    private Node root;
    public BinaryTree() {
        root = null;
    }
    private static class Node {
        int key;
        Node left;
        Node right;
        public Node(int item) {
            key = item;
            left = null;
            right = null;
        }
    }
    public int count() {
        return count(root);
    }

    private int count(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftCount = count(node.left);
            int rightCount = count(node.right);
            return 1 + leftCount + rightCount;
        }
    }
    
    //Example of code to run the function
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        int count = tree.count();
        System.out.println("The number of items in the binary tree is: " + count);
    }
}
