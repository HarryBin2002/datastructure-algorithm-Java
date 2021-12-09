package algorithm;

import java.util.Scanner;

public class MergeSort {

    public static void merge_sort(int[] arr, int head, int mid, int tail) {
        int n1 = mid - head + 1;
        int n2 = tail - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[head + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid+1 + i];
        }

        int i = 0, j = 0, u = head;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[u++] = arr1[i++];
            } else {
                arr[u++] = arr2[j++];
            }
        }

        while (i < n1) {
            arr[u++] = arr1[i++];
        }

        while (j < n2) {
            arr[u++] = arr2[j++];
        }
    }

    public static void algorithm(int[] arr, int head, int tail) {
        if (head < tail) {
            int mid = head + (tail - head)/2;
            algorithm(arr, head, mid);
            algorithm(arr, mid+1, tail);
            merge_sort(arr, head, mid, tail);
        }
    }

    /*
    Best: O(N*LogN)
    Worst: O(N*LogN)
    Stable algorithm
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