package algorithm;

import java.util.Scanner;

public class BinarySearch {

    public static int algorithm(int[] arr,int head, int tail, int key) {
        if (head <= tail) {
            int mid = head + (tail - head)/2;

            if (key > arr[mid]) {
                return algorithm(arr, mid+1, tail, key);
            }
            if (key < arr[mid]) {
                return algorithm(arr, 0, mid-1, key);
            }
            if (key == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int index_result = algorithm(arr, 0, n-1, key);
        System.out.println(index_result);

        sc.close();
    }
}