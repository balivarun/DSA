package Linked_List;


class Node{
  int data;
  Node next;
  Node(int x){
    data=x;
    next=null;
  }
}

public class deleteatend {

  public static Node deletionatend(Node head){

    // if the list is empty return null
    if(head==null){
      return null;
    }

    // if the list has only one node the delete it and return null
    if(head.next==null){
      return null;
    }

    Node secondlast=head;
    while(secondlast.next.next!=null){
      secondlast=secondlast.next;
    }

    // delete the last node by making secondlast point to null
    secondlast.next=null;

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

public static void main(String[] args){
  Node head=new Node(3);
  head.next=new Node(4);
  head.next.next=new Node(5);
  head.next.next.next=new Node(8);

  head=deletionatend(head);

  printlist(head);

}

}

