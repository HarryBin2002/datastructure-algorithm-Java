
import nodepackage.Node;
import java.util.Scanner;

public class SingleLinkedList {

    // Create a new Node.
    public static Node create_node(int d) {
        Node temp = new Node();
        temp.data = d;
        temp.next = null;
        return temp;
    }

    // Add Function
    public static Node add_to_tail(Node head, int value) {
        Node temp = create_node(value);
        Node p = head;
        while (p.next != null) p = p.next;
        p.next = temp;
        return head;
    }

    public static Node add_to_head(Node head, int value) {
        Node temp = create_node(value);
        temp.next = head;
        head = temp;
        return head;
    }

    public static Node add_to_at(Node head, int value, int pos) {
        Node temp = create_node(value);
        Node p = head;
        while (pos-1 != 0) {
            p = p.next;
            pos--;
        }
        temp.next = p.next;
        p.next = temp;
        return head;
    }

    // Delete Function
    public static Node delete_to_tail(Node head) {
        Node p = head;
        while (p.next.next != null) p = p.next;
        p.next = null;
        return head;
    }

    public static Node delete_to_head(Node head) {
        Node temp = head;
        Node p = temp.next;
        head = p;
        temp.next = null;
        return head;
    }

    public static Node delete_to_at(Node head, int pos) {
        Node p = head;
        while (pos - 1 != 0) {
            p = p.next;
            pos--;
        }
        p.next = p.next.next;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        Node head = create_node(x);

        for (int i = 1; i < n; i++) {
            x = sc.nextInt();
            head = add_to_tail(head, x);
//            head = add_to_head(head, x);
        }

//        head = add_to_at(head, 100, 2);

//        head = delete_to_head(head);
//        head = delete_to_tail(head);

//        head = delete_to_at(head, 2);



        for (Node p = head; p != null; p = p.next) {
            System.out.println(p.data);
        }

        sc.close();
    }
}