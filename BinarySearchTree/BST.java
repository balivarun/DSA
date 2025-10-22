package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

  public void levelorder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      Node curr = q.poll();
      System.out.print(curr.data + " ");
      if (curr.left != null) {
        q.add(curr.left);
      }
      if (curr.right != null) {
        q.add(curr.right);
      }
    }
  }

  public Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }
    if (data < root.data) {
      root.left = insert(root.left, data);
    }
    if (data > root.data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  public  boolean search(Node root, int data) {
    if (root == null) {
      return false;
    }
    if (root.data == data) {
      return true;
    }
    if (root.data > data) {
      return search(root.left, data);
    }
    return search(root.right, data);
  }

   public void printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}