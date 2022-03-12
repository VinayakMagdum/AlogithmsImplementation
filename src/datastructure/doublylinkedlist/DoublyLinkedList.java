package datastructure.doublylinkedlist;

public class DoublyLinkedList {
    public Node head;
    static class Node {
        Node next;
        Node prev;
        String data;
        Node(String data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    private void printList() {
        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Node head = new Node("Head");
        list.head = head;
        Node first = new Node("First");
        head.next = first;
        Node second = new Node("Second");
        first.next  = second;
        first.prev = head;
        Node third = new Node("Third");
        second.next = third;
        second.prev = first;
        Node fourth = new Node("Fourth");
        third.next = fourth;
        third.prev = third;
        Node fifth = new Node("Fifth");
        fourth.next = fifth;
        fourth.prev = fourth;
        list.printList();
    }
}
