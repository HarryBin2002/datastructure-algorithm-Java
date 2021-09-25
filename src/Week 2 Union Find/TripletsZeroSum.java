import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TripletsZeroSum {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\DSA-Java\\src\\Week 2 Union Find\\demosum1.txt");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        while (sc.hasNext()) {
            arr[x++] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }

        sc.close();
    }
}