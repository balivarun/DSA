package Linked_List;


class Node{
  int data;
  Node next;

  // Constructor to initialize the node
  Node(int x){
    data=x;
    next=null;
  }
}

public class insertion {

  // function to incert a new node in front
  public static Node insertAtFront(Node head,int x){
    Node newnode=new Node(x);
    newnode.next=head;
    return newnode;
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

public static void main(String[] args){
    // Create the linked list 2->3->4->5
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        // Insert a new node at the
        // front of the list
        int x = 5;
        head = insertAtFront(head, x);

        printlist(head);
    }
}


