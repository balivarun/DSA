package doubley_linkedlist;

class Node {
  int data;
  Node prev, next;

  Node(int x) {
    data = x;
    prev.next = null;
  }
}

public class insertatSpecificPosition {

  // function for inserting the data at the position
  public static Node insertAtPosition(Node head, int pos, int newdata) {

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

    if(newnode.next!=null){
      newnode.next.prev=newnode;
    }

    return head;
  }

  public static void printList(Node head){
    Node curr=head;
    while(curr!=null){
      System.out.print(curr.data);
      if(curr.next!=null){
        System.out.print("<->");  
      }
      curr=curr.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.prev = head;
    head.next.next = new Node(4);
    head.next.next.prev = head.next;

    // Print the original list
    System.out.print("Original Linked List: ");
    printList(head);

    // Insert new node with data 3 at position 3
    System.out.print("Inserting Node with data 3 at position 3: ");
    int data = 3;
    int pos = 3;
    head = insertAtPosition(head, pos, data);

    // Print the updated list
    printList(head);
  }

}
