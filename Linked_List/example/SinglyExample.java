package Linked_List.example;

import Linked_List.SinglyLinkedList;
import Linked_List.node;


public class SinglyExample {

  public static void main(String[] args){

   SinglyLinkedList obj = new SinglyLinkedList();

        node ab = new node(2);
    // Node a= new Node(3);
    // Node b = new Node(5);
    // Node c=new Node(8);
    // Node d=new Node(1);
 obj.insertHead(ab);
 obj.insertAfter(ab,7);
obj.insertAfter(ab,5);
obj.deleteAtPosition(1);
 obj.traverse();


  }
}
