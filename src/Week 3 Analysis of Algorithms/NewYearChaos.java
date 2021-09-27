import java.util.Scanner;

public class NewYearChaos {

    public static void show(int[] arr) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            int original_index = arr[i] - 1, new_index = i;
            int diff = new_index - original_index;
            if (0 < diff && diff <= 2) {
                count += diff;
            } else if (diff > 2) {
                System.out.println("Too chaotic");
                check = false;
                break;
            }
        }
        if (check) System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        show(arr);

        sc.close();
    }
}