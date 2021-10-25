package algorithm;

import java.util.Scanner;

public class SelectionSort {

    private static void exch(int[] a, int i, int j)
    {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static int index_min_element(int[] arr, int n, int index) {
        int min_value = arr[index], min_index = index;
        for (int i = index; i < n; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void algorithm(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int idx = index_min_element(arr, n, i);
            exch(arr, i, idx);
        }
    }

    /*
    Best: O(n^2)
    Worst: O(n^2)
     */

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