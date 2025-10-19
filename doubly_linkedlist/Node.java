package doubly_linkedlist;

public class Node {
  int data;
  Node prev;
  Node next;

  public Node(int value) {
    data = value;
    prev = null;
    next = null;
  }
}
