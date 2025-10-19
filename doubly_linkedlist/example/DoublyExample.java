package doubly_linkedlist.example;

import doubly_linkedlist.DoublyLinkedList;
import doubly_linkedlist.Node;

public class DoublyExample {

  public static void main(String[] args) {
    DoublyLinkedList obj = new DoublyLinkedList();

    Node ab = new Node(2);
    Node a= new Node(3);
    Node b = new Node(5);
    Node c=new Node(8);
    Node d=new Node(1);



    obj.insertHead(ab);
    obj.traverse();
    obj.insertAfter(ab,a);
    obj.traverse();
    obj.insertAfter(ab,b);
    obj.traverse();
    obj.insertAfter(b,c);
    obj.traverse();
    obj.insertBefore(b,d);
    obj.traverse();
    obj.deleteAfter(b);
    obj.traverse();


  }

}
