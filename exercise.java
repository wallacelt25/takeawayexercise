public class BinaryTree {
    private Node root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Node class
    private static class Node {
        int key;
        Node left;
        Node right;

        // Constructor
        public Node(int item) {
            key = item;
            left = null;
            right = null;
        }
    }

    // Counts the number of nodes in the binary tree
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

    // Example usage
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        int count = tree.count();
        System.out.println("The number of nodes in the binary tree is: " + count);
    }
}
