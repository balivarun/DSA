package doubley_linkedlist;

class Node {
  int data;
  Node prev, next;

  Node(int x) {
    data = x;
    prev = next = null;
  }
}

public class insertAtfront {

  public static Node insertAtFront(Node head, int data) {

    Node newnode = new Node(data);

    // Make next of new node as head
    newnode.next = head;

    // Change prev of head node to new node
    if (head != null) {
      head.prev = newnode;
    }

    head = newnode;

    // Return the new node as the head of the doubly
    // linked list
    return head;

  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data);
      if (temp.next != null) {
        System.out.print(" <-> ");
      }
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    // 2 <-> 3 <-> 4 -> NULL
    Node head = new Node(2);
    head.next = new Node(3);
    head.next.prev = head;
    head.next.next = new Node(4);
    head.next.next.prev = head.next;

    // Print the original list
    System.out.println("Original Linked List: ");
    printList(head);

    // Insert a new node at the front of the list
    System.out.println(
        "After inserting Node at the front: ");
    int data = 1;
    head = insertAtFront(head, data);

    // Print the updated list
    printList(head);
  }

}
