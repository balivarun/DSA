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

  public boolean search(Node root, int data) {
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


  public int maxheight(Node root){
    if(root==null){
      return -1;
    }
    int leftheight=maxheight(root.left);
    int rightheight=maxheight(root.right);

    return 1+Math.max(leftheight,rightheight);

  }

  public int iabalancedrec(Node root){
    if(root==null){
      return 0;
    }
    int leftheight=iabalancedrec(root.left);
    int rightheight=iabalancedrec(root.right);

    if(leftheight==-1||rightheight==-1||Math.abs(leftheight-rightheight)>1){
      return -1;
    }

    return Math.max(leftheight,rightheight)+1;
  }

  public boolean isbalanced(Node root){
    return iabalancedrec(root)>0;
  }


  public Node getsucc(Node root){
    while(root.left!=null){
      root=root.left;
    }
    return root;
  }


  public Node deleteNode(Node root, int valueToDelete) {
    if (root == null) {
      return null;
    }
    if(valueToDelete<root.data){
      root.left=deleteNode(root.left,valueToDelete);
    }
    else if(valueToDelete>root.data){
      root.right=deleteNode(root.right,valueToDelete);
    }
    else{
      if(root.left==null&root.right==null){
        return null;
      }
      else if(root.left==null){
        return root.right;
      }
      else if(root.right==null){
        return root.left;
      }
      else{
        Node succ=getsucc(root.right);
        root.data=succ.data;
        root.right=deleteNode(root.right,succ.data);
      }
    }
    return root;
  }

  public int minvalue(Node root) {
    if (root == null) {
      return -1;
    }
    Node curr = root;
    while (curr.left != null) {
      curr = curr.left;
    }
    return curr.data;
  }

  public int maxvalue(Node root) {
    if (root == null) {
      return -1;
    }
    Node curr = root;
    while (curr.right != null) {
      curr = curr.right;
    }
    return curr.data;
  }



  public void printInorder(Node node) {
    if (node == null)
      return;

    printInorder(node.left);
    System.out.print(node.data + " ");
    printInorder(node.right);
  }
}