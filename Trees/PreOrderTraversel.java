package Trees;
import java.util.*;


class Node{
  int data;
  Node left,right;
  Node(int data){
    this.data=data;
    left=right=null;
  }
}

public class PreOrderTraversel {

  public static void preorder(Node root,ArrayList<Integer> res){
    if(root==null){
      return;
    }
    res.add(root.data);
    preorder(root.left,res);
    preorder(root.right,res);
  }
  public static void main(String[] args){
    Node root=new Node(2);
    root.left=new Node(6);
    root.right=new Node(5);
    root.left.left=new Node(8);
    root.left.right=new Node(9);
    root.right.right=new Node(2);

    ArrayList<Integer> res=new ArrayList<>();
    preorder(root,res);

    for(int i:res){
      System.out.print(i+" ");
    }
    System.out.println();
    }
}
