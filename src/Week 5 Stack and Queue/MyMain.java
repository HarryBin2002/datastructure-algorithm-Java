import java.util.Scanner;
import week5.InterfaceStackAndQueue;
import week5.Node;
import week5.MyLinkedStack;
import week5.MyLinkedQueue;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int x = sc.nextInt();

        MyLinkedStack sk = new MyLinkedStack();
//        MyLinkedQueue sk = new MyLinkedQueue();
        Node head = sk.create(x);
        for (int i = 1; i < n; i++) {
            x = sc.nextInt();
            head = sk.push(head, x);
        }

        sk.show(head);
        sk.pop(head);
        System.out.println();

        sk.show(head);
        sk.pop(head);
        System.out.println();

        sc.close();
    }
}