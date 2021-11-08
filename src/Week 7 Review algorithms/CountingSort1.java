package week7;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort1 {

    public static void counting(int[] arr, int[] result) {
        for (int i = 0; i < arr.length; i++) {
            result[arr[i]]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[n-1]);
        System.out.println();
        System.out.println();

        int nR = arr[n-1] + 1;
        int[] result = new int[nR];
        for (int i = 0; i < nR; i++) {
            result[i] = 0;
        }

        counting(arr, result);

        for (int i = 0; i < nR; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}