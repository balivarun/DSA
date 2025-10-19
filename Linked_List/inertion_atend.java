package Linked_List;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

public class inertion_atend {

  public static Node insertatEnd(Node head, int s) {

    // Create a new node
    Node newnode = new Node(s);

    if (head == null) {
      return newnode;
    }

    // Store the head reference in a temporary variable
    Node last = head;

    // Traverse till the last node
    while (last.next != null) {
      last = last.next;
    }

    // Change the next pointer of the last node
    // to point to the new node
    last.next = newnode;

    return head;

  }

  public static void printlist(Node head){
    Node curr=head;
    while(curr!=null){
      System.out.print(curr.data);
      if(curr.next!=null){
      System.out.print("->");
      }
      curr=curr.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(5);
    head.next = new Node(6);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);

    head = insertatEnd(head, 9);
    printlist(head);
  }
}
