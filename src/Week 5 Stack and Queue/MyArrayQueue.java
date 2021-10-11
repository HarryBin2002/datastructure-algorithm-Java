package week5;

import week5.InterfaceStackAndQueue2;

public class MyArrayQueue implements InterfaceStackAndQueue2 {
    private int[] arr;
    private int SIZE;
    private int headIndex, tailIndex;

    MyArrayQueue(int sz) {
        SIZE = sz;
        arr = new int[SIZE];
        headIndex = -1;
        tailIndex = -1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public boolean isFull() {
        return (headIndex == 0) && (tailIndex == SIZE - 1);
    }

    @Override
    public int showTopIndex() {
        return 0;
    }

    @Override
    public void push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            arr[tailIndex] = value;
        } else {
            System.out.println("Queue is Full");
        }
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            headIndex++;
        } else {
            System.out.println("Queue is Empty");
        }
    }

    @Override
    public void show() {
        for (int i = tailIndex; i >= headIndex; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}