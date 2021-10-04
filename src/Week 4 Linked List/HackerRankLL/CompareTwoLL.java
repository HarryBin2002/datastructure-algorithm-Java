
import nodepackage.Node;
import java.util.Scanner;


public class CompareTwoLL {
    //Create a new Node
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

            // Checking that Two LL are equal.
            if (n != m) {
                System.out.println(0);
            } else {
                boolean check = true;
                Node u = head1, v = head2;
                while (u.next != null) {
                    if (u.data != v.data) {
                        System.out.println(0);
                        check = false;
                        break;
                    }
                    u = u.next;
                    v = v.next;
                }
                if (check) {
                    System.out.println(1);
                }
            }
            t--;
        }

        sc.close();
    }
}