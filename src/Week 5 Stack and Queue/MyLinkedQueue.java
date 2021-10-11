package week5;

import week5.InterfaceStackAndQueue;
import week5.Node;

/*
This Queue below is built using OOP (Abstraction) Interface.
Queue works by FIFO.
 */

public class MyLinkedQueue implements InterfaceStackAndQueue{

    @Override
    public boolean isEmpty(Node head) {
        return head == null;
    }

    @Override
    public Node create(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        return temp;
    }

    @Override
    public Node push(Node head, int value) {
        Node temp = create(value);
        temp.next = head;
        head = temp;
        return head;
    }

    @Override
    public Node pop(Node head) {
        Node p = head;
        while (p.next.next != null) p = p.next;
        p.next = null;
        return head;
    }

    @Override
    public void show(Node head) {
        for (Node p = head; p != null; p = p.next) {
            System.out.print(p.data + " ");
        }
    }
}