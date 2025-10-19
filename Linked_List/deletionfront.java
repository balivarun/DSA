package Linked_List;

//deletion from front

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

public class deletionfront {

  public static Node deletionatfront(Node head) {

    if (head == null) {
      return null;
    }

    // Store the current head in a
    // temporary variable
    // Just doing head = head.next; is enough to remove the first node — the old head becomes unreachable and will be garbage-collected automatically.
    // Node temp = head;

    // Move the head pointer to the next node
    head = head.next;

    // Free the memory of the old head node
    // temp = null;

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
    Node head = new Node(2);
    head.next = new Node(6);
    head.next.next = new Node(4);
    head.next.next.next = new Node(2);

    head = deletionatfront(head);

    printlist(head);

  }
}
