package datastructure.singlylinkedlist;

import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {
    public  Node head;
    static class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void printList() {
        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        Node node1 = new Node("first");
        list.head = node1;
        Node node2 = new Node("Second");
        Node node3 = new Node("third");
        Node node4 = new Node("fourth");
        Node node5 = new Node("fifth");
        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        list.printList();

    }
}
