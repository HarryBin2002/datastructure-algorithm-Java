import nodepackage.Node;
import java.util.Scanner;


public class ReverseLL {
    public static Node create(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        return temp;
    }

    // Add new Node to the left of the Linked List.
    public static Node add_left(Node head, int value) {
        Node temp = create(value);
        temp.next = head;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            Node head = create(x);

            for (int i = 1; i < n; i++) {
                x = sc.nextInt();
                head = add_left(head, x);
            }

            for (Node p = head; p != null; p = p.next) {
                System.out.print(p.data + " ");
            }

            System.out.println();

            t--;
        }

        sc.close();
    }
}