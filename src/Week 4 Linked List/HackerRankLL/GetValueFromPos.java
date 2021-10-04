
import nodepackage.Node;
import java.util.Scanner;

public class GetValueFromPos {

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
            int n = sc.nextInt();
            int x = sc.nextInt();
            Node head = create(x);

            for (int i = 1; i < n; i++) {
                x = sc.nextInt();
                head = add_right(head, x);
            }

            int pos = sc.nextInt();
            int index = n - pos - 1;

            Node p = head;
            while (index > 0) {
                p = p.next;
                index--;
            }

            System.out.println(p.data);
            t--;
        }

        sc.close();
    }
}