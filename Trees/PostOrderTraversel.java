package Trees;

import java.util.ArrayList;

public class PostOrderTraversel {

  public static void postorder(Node root,ArrayList<Integer> res){
    if(root==null){
      return ;
    }

    postorder(root.left,res);
    postorder(root.right,res);
    res.add(root.data);
  }

  public static void main(String[] args){
     Node root=new Node(2);
    root.left=new Node(6);
    root.right=new Node(5);
    root.left.left=new Node(8);
    root.left.right=new Node(9);
    root.right.right=new Node(2);

    ArrayList<Integer> res=new ArrayList<>();
    postorder(root,res);

    for(int i:res){
      System.out.print(i+" ");
    }
    System.out.println();
    }

}
