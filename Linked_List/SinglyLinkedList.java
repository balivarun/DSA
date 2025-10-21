package Linked_List;
// creating the linked list

public class SinglyLinkedList {

    node head;

    public void insertHead(node newnode){
    head=newnode;
  }
    // Insert at the front
    public node insertAtFront(node head, int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
        return head;
    }

    // Insert at a given position
    public node insertAtPosition(node head, int pos, int data) {
        node newnode = new node(data);

        // Insert at head
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return head;
        }

        node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        newnode.next = curr.next;
        curr.next = newnode;

        return head;
    }

    // Insert after a given node
    public void insertAfter(node node, int data) {
        if (node == null) {
            System.out.println("Given node cannot be null");
            return;
        }
        node newnode = new node(data);
        newnode.next = node.next;
        node.next = newnode;
    }

    // Delete node at a given position
    public node deleteAtPosition(int pos) {
        if (head == null) return null;

        // If deleting the head
        if (pos == 1) {
            return head.next;
        }

        node curr = head;
        for (int i = 1; curr != null && i < pos - 1; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        curr.next = curr.next.next;
        return head;
    }

    // Traverse the list
    public void traverse() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}
