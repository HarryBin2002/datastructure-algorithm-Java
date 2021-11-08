package algorithm;

import java.util.Scanner;

public class HeapSort {

    public static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int n, int i) {
        // Set index for root and branch
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Checking that if left or right branch bigger than root, then we exchange index them.
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // After exchange index, we need to edit root below
        if (largest != i) {
            exch(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

    public static void algorithm(int[] arr, int n) {
        // Set up heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Set up max - heap, exchange the biggest element to the end
        for (int i = n - 1; i >= 1; i--) {
            exch(arr, 0, i);

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        algorithm(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}