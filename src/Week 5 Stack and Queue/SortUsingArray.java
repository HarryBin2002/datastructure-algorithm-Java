package week5;
/*
Sort a Stack or Queue by Array.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class SortUsingArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(45);
        q.add(2);
        q.add(56);
        q.add(5);

        while (!q.isEmpty()) {
            arr.add(q.peek());
            q.remove();
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            q.add(arr.get(i));
        }

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}