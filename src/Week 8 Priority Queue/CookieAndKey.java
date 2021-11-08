package week8;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CookieAndKey {

    public static int loop(PriorityQueue<Integer> pQ, int key) {
        int count = 0;
        while (pQ.peek() < key && pQ.size() > 1) {
            int leastnum = pQ.poll();
            int addnum = 1 * leastnum + 2 * pQ.poll();
            pQ.add(addnum);
            count++;
        }
        if (pQ.size() <= 1) {
            return -1;
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        int n = sc.nextInt();
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pQ.add(sc.nextInt());
        }

        System.out.println(loop(pQ, key));

        sc.close();
    }
}