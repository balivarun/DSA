package Trees;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class ArrayToBinaryTree {

    // Function to insert nodes level-wise
    static Node insertLevelOrder(int[] arr, int i) {
        // Base case: if index is out of array bounds
        if (i >= arr.length) {
            return null;
        }

        // Create a new node
        Node root = new Node(arr[i]);

        // Recursively create left and right subtrees
        root.left = insertLevelOrder(arr, 2 * i + 1);
        root.right = insertLevelOrder(arr, 2 * i + 2);

        return root;
    }

    // Inorder traversal to verify the tree
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Node root = insertLevelOrder(arr, 0);

        System.out.println("Inorder traversal of tree:");
        inorder(root);
        System.out.println();
    }
}


