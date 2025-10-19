package doubly_linkedlist;

public class DoublyLinkedList {

  Node head;

  public Node insertAtFront(Node head, int data) {

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

  Node insertAtPosition(Node head, int pos, int newdata) {

    Node newnode = new Node(newdata);

    // Insertion at the beginning
    if (pos == 1) {
      newnode.next = head;

      // If the linked list is not empty, set the prev of head to new node
      if (head != null) {
        head.prev = newnode;
      }
      head = newnode;
      return head;
    }

    Node curr = head;

    for (int i = 1; i < pos - 1 && curr != null; i++) {
      curr = curr.next;
    }
    if (curr == null) {
      System.out.println("position is out bounds");
    }

    // Set the prev of new node to curr
    newnode.prev = curr;

    // Set the next of new node to next of curr
    newnode.next = curr.next;

    // Update the next of current node to new node
    curr.next = newnode;

    if (newnode.next != null) {
      newnode.next.prev = newnode;
    }

    return head;
  }

  Node delPos(Node head, int pos) {
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



  public void insertHead(Node newnode){
    head=newnode;
  }

  /*
   *  insert new node after a given node
   */
  public void insertAfter(Node node,Node newnode){

    Node curr=head;
    while(curr!=node){
      curr=curr.next;

    }
    newnode.prev=curr;
    newnode.next=curr.next;
    curr.next=newnode.prev;
    curr.next=newnode;
  }

  public void insertBefore(Node node,Node newnode){
    Node curr=head;
    while(curr!=node){
      curr=curr.next;
    }
    newnode.next=curr;
    newnode.prev=curr.prev;
    curr.prev.next=newnode;
    curr.prev=newnode;
  }

  public void deleteAfter(Node node){
    Node curr=head;
    while(curr!=node){
      curr=curr.next;
    }
    curr.next=curr.next.next;
  }

  public void traverse() {
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

}