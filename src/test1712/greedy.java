import java.util.Scanner;

public class greedy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {50, 20, 10, 5, 2, 1};

        int result = 0;
        for (int i = 0; i <= 5; i++) {
            result += n/arr[i];
            n %= arr[i];
        }



        System.out.println(result);

        sc.close();
    }
}