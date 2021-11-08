package week7;

import java.util.Scanner;

public class FindTheMedian {

    public static boolean findthemedian(int[] arr, int partition) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[partition]) {
                count++;
            } else if (arr[i] > arr[partition]) {
                count--;
            }
        }

        if (count == 0) {
            return true;
        } else return false;
    }

    public static int algorithm(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (findthemedian(arr, i) == true) {
                return arr[i];
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

        int result = algorithm(arr, n);

        System.out.println(result);

        sc.close();
    }
}