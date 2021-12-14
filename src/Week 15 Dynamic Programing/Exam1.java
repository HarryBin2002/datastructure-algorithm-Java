// Finding the longest increase string

import java.util.Scanner;

public class Exam1 {

    public static int LIS(int[] arr, int n) {
        int[] arr_res = new int[n];
        int res;
        arr_res[0] = 1;

        for (int i = 1; i < n; i++) {
            res = 0;
            for (int j = 0; j < i; j++) {
                if ((arr[i] > arr[j]) && (arr_res[j] > res)) {
                    res = arr_res[j];
                }
            }
            arr_res[i] = res + 1;
        }

        int result = arr_res[0];
        for (int i = 0; i < n; i++) {
            if (arr_res[i] > result) {
                result = arr_res[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = LIS(arr, n);

        System.out.println(result);

        sc.close();
    }
}