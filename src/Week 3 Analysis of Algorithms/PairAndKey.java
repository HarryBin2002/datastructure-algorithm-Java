import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class PairAndKey {

    public static int Find_Diff(int[] arr, int k) {
        int x = 0, y = 1, count = 0;
        while (y < arr.length) {
            int diff = Math.abs(arr[y] - arr[x]);

            if (diff == k) {
                count++;
                y++;
            } else if (diff < k) {
                y++;
            } else if (diff > k) {
                x++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input Data
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting Array
        Arrays.sort(arr);

        int result = Find_Diff(arr, k);

        System.out.println(result);

        sc.close();
    }
}