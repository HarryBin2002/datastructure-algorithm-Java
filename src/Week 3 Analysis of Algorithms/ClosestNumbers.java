import java.util.Scanner;

public class ClosestNumbers {
    // Bubble Sort Algorithm
    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean check = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = false;
                }
            }
            if (check) break;
        }
    }

    // Find The smallest difference between two adjacent numbers
    public static int smallest_diff(int[] arr) {
        int smallest_diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i-1];
            if (diff < smallest_diff) {
                smallest_diff = diff;
            }
        }
        return smallest_diff;
    }

    // Show result pair of array elements has difference is the smallest
    public static void show_result(int[] arr, int smallest_diff) {
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i-1];
            if (diff == smallest_diff) {
                System.out.print(arr[i-1] + " " + arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get data from keyboard to an array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr);

        int smallest_diff = smallest_diff(arr);

        show_result(arr, smallest_diff);

        sc.close();
    }
}