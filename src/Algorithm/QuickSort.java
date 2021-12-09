package algorithm;

import java.util.Scanner;

public class QuickSort {
    public static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int head, int tail) {
        int pivot = arr[head];
        int i = head + 1, j = tail;
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (j <= i) break;
            exch(arr, i, j);
            i++;
            j--;
        }
        exch(arr, head, j);
        return j;
    }

    public static void algorithm(int[] arr, int head, int tail) {
        if (head < tail) {
            int pi = partition(arr, head, tail);

            algorithm(arr, head, pi-1);
            algorithm(arr, pi+1, tail);
        }
    }

    /*
    Best: O(N*LogN)
    Worst: O(N^2)
    Not stable algorithm
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        algorithm(arr, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}