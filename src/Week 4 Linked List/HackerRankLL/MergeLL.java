import nodepackage.Node;

import java.util.Scanner;


public class MergeLL {
    // Create a new Node.
    public static Node create(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        return temp;
    }

    // Add new Node to the end of the Linked List.
    public static Node add_right(Node head, int value) {
        Node temp = create(value);
        Node p = head;
        while (p.next != null) p = p.next;
        p.next = temp;
        return head;
    }

    // Merge sort
    public static void merge_sort_LL(Node head1, Node head2) {
        Node i = head1, j = head2;

        while (i != null && j != null) {

            if (i.data <= j.data) {
                System.out.print(i.data + " ");
                i = i.next;
            } else {
                System.out.print(j.data + " ");
                j = j.next;
            }

        }

        while (i != null) {
            System.out.print(i.data + " ");
            i = i.next;
        }

        while (j != null) {
            System.out.print(j.data + " ");
            j = j.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {

            // create Linked List 1.
            int n = sc.nextInt();
            int x = sc.nextInt();
            Node head1 = create(x);

            for (int i = 1; i < n; i++) {
                x = sc.nextInt();
                head1 = add_right(head1, x);
            }

            // Create Linked List 2.
            int m = sc.nextInt();
            int y = sc.nextInt();
            Node head2 = create(y);

            for (int i = 1; i < m; i++) {
                y = sc.nextInt();
                head2 = add_right(head2, y);
            }

            merge_sort_LL(head1, head2);
            System.out.println();

            t--;
        }

        sc.close();
    }
}