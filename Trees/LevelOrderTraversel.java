package Trees;

import java.util.*;

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class LevelOrderTraversel {

  public static void levelorder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
      Node curr=q.poll();
      System.out.print(curr.data+" ");
      if(curr.left!=null){
        q.add(curr.left);
      }
      if(curr.right!=null){
        q.add(curr.right);
      }
    }
  }

  public static void main(String[] args) {
    Node root = new Node(2);
    root.left = new Node(5);
    root.right = new Node(7);
    root.left.left = new Node(3);
    root.left.right = new Node(1);
    root.right.right = new Node(8);

    levelorder(root);
    System.out.println();

  }
}
