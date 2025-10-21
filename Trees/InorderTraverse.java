package Trees;
import java.util.*;

class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data=data;
    left=right=null;
  }
}

//inorder traversel means first left node then print data and then right node

public class InorderTraverse {

  public static void inorder(Node root,ArrayList<Integer> res){
    if(root==null){
      return ;
    }
    inorder(root.left,res);
    res.add(root.data);
    inorder(root.right,res);
  }
  public static void main(String[] args){

    Node root=new Node(2);
    root.left=new Node(5);
    root.right=new Node(7);
    root.left.left=new Node(3);
    root.left.right=new Node(1);
    root.right.right=new Node(8);

    ArrayList<Integer> res=new ArrayList<>();
    inorder(root,res);

    for(int i:res){
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
