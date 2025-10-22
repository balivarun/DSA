package Trees;

class Node {
  int data;
  Node left, right;

  Node(int data) {
    this.data = data;
  }

}

public class ArrayToBinaryTree2 {

  public static Node arraytobin(int arr[], int i) {
    if (arr.length == 0 || i >= arr.length) {
      return null;
    }

    Node root = new Node(arr[i]);

    root.left = arraytobin(arr, 2 * i + 1);
    root.right = arraytobin(arr, 2 * i + 2);

    return root;

  }

  public static void traverse(Node root) {
    if (root == null) {
      return;
    }
    traverse(root.left);
    System.out.print(root.data + " ");
    traverse(root.right);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node root = arraytobin(arr, 0);
    traverse(root);
    System.out.println();
  }

}
