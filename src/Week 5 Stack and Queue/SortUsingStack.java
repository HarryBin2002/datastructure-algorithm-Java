package week5;

/*
Sorting a Stack or Queue by using Stack
 */

import java.util.Scanner;
import java.util.Stack;

public class SortUsingStack {

    public static void recursion(Stack<Integer> sk, int x) {
        if (!sk.isEmpty()) {
            int y = sk.peek();
            if (x > y) {
                sk.pop();
                recursion(sk, x);
                sk.push(y);
            } else {
                sk.push(x);
            }
        } else {
            sk.push(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> sk = new Stack<Integer>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            recursion(sk, x);
        }

        while (!sk.isEmpty()) {
            System.out.println(sk.peek());
            sk.pop();
        }

        sc.close();
    }
}