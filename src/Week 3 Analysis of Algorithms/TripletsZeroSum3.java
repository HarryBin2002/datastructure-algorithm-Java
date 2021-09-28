import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
This Algorithm will improve the algorithm which finds three numbers that have Zero-sum before.
This Algorithm use pointers
*/

public class TripletsZeroSum3 {

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int lo = i + 1, hi = arr.length - 1;

            while (lo < hi) {
                int sum = arr[i] + arr[lo] + arr[hi];
                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[lo] + " " + arr[hi]);
                    lo++;
                    hi--;
                } else if (sum < 0) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\DSA-Java\\src\\Week 3 Analysis of Algorithms\\TripletsInputData.txt");
        Scanner sc = new Scanner(file);

        // get data from a text file and put them to an array.
        int n = sc.nextInt();
        int[] arr  = new int[n];
        int x = 0;
        while (sc.hasNext()) {
            arr[x++] = sc.nextInt();
        }

        Arrays.sort(arr);

        show(arr);

        sc.close();
    }
}