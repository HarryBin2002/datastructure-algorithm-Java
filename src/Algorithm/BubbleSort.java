package algorithm;

import java.util.Scanner;

public class BubbleSort {
    private static void exch(int[] a, int i, int j)
    {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void algorithm(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            boolean check = true; // this is reason why bubble sort has O(n) complexity in the best case.
            for (int j = 0; j < n-1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    exch(arr, j, j+1);
                    check = false;
                }
            }
            if (check) {
                break;
            }
        }
    }

    /*
     Best: O(N)
     Worst: O(N^2)
     Stable algorithm
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