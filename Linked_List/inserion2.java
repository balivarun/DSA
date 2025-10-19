package Linked_List;

//insertion at front

class Node{
  int data;
  Node next;

  Node(int x){
    data=x;
    next=null;
  }
}

public class inserion2 {

  public static Node insertatfront(int s,Node head){
    Node newnode=new Node(s);
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
    Node head=new Node(3);
    head.next=new Node(4);
    head.next.next=new Node(6);
    head.next.next.next=new Node(8);

    int s=9;
    head=insertatfront(s,head);

    printlist(head);
  }

}
