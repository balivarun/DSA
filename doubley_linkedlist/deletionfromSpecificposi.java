package doubley_linkedlist;

public class deletionfromSpecificposi {

  public static Node delPos(Node head, int pos) {
    if (head == null) {
      return null;
    }

    Node curr = head;

    // traverse to the node at the given position

    for (int i = 1; curr != null && i < pos; i++) {
      curr = curr.next;
    }

    if (curr == null) {
      // position exceeds list length, no deletion
      return head;
    }

    // if the node to delete is not the first node
    // update previous node's next
    if (curr.prev != null) {
      curr.prev.next = curr.next;
    }

    // if the node to delete is not the last node
    // update next node's prev
    if (curr.next != null)
      curr.next.prev = curr.prev;

    // if deleting the head, move head pointer to next node
    if (head == curr)
      head = curr.next;

    curr = null; // free up the memory
    return head;
  }

  public static void printlist(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data);
      if (curr.next != null) {
        System.out.print("<->");
      }
      curr = curr.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.prev = head;
    head.next.next = new Node(3);
    head.next.next.prev = head.next;

    head = delPos(head, 2);
    
    printlist(head);
  }
}
