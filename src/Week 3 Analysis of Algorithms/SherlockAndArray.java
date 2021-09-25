import java.util.Scanner;

public class SherlockAndArray {
    /*
    we know that: If the valid array contains 2 times sum and remaining number.
    So we will add number in the left of remaining number while subtract the next number
    */
    public static String SAA(int[] arr, int sum) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (2 * x == sum - arr[i]) {
                return "YES";
            }
            x += arr[i];
        }
        return "NO";
    }

    // Find sum of array
    public static int sum_arr(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input the number of test cases
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // get data from key board
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = sum_arr(arr, n);

            String result = SAA(arr, sum);
            System.out.println(result);

            t--;
        }
        sc.close();
    }
}