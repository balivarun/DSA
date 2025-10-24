package BinarySearchTree.example;

import BinarySearchTree.BST;
import BinarySearchTree.Node;

public class binaryExample {
  public static void main(String[] args) {
    BST obj = new BST();
    Node root = null;
    root = obj.insert(root, 20);
    root = obj.insert(root, 8);
    root = obj.insert(root, 22);
    root = obj.insert(root, 4);
    root = obj.insert(root, 12);
    root = obj.insert(root, 10);
    root = obj.insert(root, 14);

    // obj.printInorder(root);

    // obj.deleteNode(root, 8);
    // System.out.println(obj.maxheight(root));
    // System.out.println(obj.minvalue(root));
    // System.out.println(obj.maxvalue(root));
    System.out.println(obj.isbalanced(root));
    obj.printInorder(root);
    System.out.println();
    // obj.levelorder(root);
    // System.out.println();
    // System.out.println(obj.search(root,1));

  }
}
