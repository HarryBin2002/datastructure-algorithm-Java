package week5;

import week5.InterfaceStackAndQueue2;

public class MyArrayStack implements InterfaceStackAndQueue2 {

    private int[] arr;
    private int SIZE;
    private int top_index;

    MyArrayStack(int sz) {
        SIZE = sz;
        arr = new int[SIZE];
        top_index = -1;
    }

    @Override
    public boolean isEmpty() {
        return top_index < 0;
    }

    @Override
    public boolean isFull() {
        return top_index == SIZE - 1;
    }

    @Override
    public int showTopIndex() {
        return arr[top_index];
    }

    @Override
    public void push(int value) {
        if (!isFull()) {
            top_index++;
            arr[top_index] = value;
        } else {
            System.out.println("Stack is Full");
        }
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            top_index--;
        } else {
            System.out.println("Stack is Empty");
        }
    }

    @Override
    public void show() {
        for (int i = 0; i <= top_index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}