package week5;

import week5.InterfaceStackAndQueue2;
import week5.MyArrayStack;
import week5.MyArrayQueue;
import java.util.Scanner;

public class MyMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

//        MyArrayStack sk = new MyArrayStack(size);
        MyArrayQueue q = new MyArrayQueue(size);
        for (int i = 0; i < size; i++) {
            int x = sc.nextInt();
            q.push(x);
        }

        q.show();
        q.pop();
        System.out.println();

        q.show();
        q.pop();
        System.out.println();

        q.show();
        q.pop();
        System.out.println();

        sc.close();
    }
}