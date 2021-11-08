package week7;

import java.util.Scanner;

public class FindTheMedian2 {

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

    public static void recursion(boolean[] narr, int[] arr, int head, int tail) {
        if (head < tail) {
            int partition = head + (tail - head)/2;
            recursion(narr, arr, 0, partition);
            recursion(narr, arr, partition + 1, tail);
            narr[partition] = findthemedian(arr, partition);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] narr = new boolean[n];

        recursion(narr, arr, 0, n - 1);

//        for (int i = 0; i < n; i++) {
//            System.out.print(narr[i] + " ");
//        }

        for (int i = 0; i < n; i++) {
            if (narr[i] == true) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}