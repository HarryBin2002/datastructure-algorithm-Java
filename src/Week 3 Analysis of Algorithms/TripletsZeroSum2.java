import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import binarypackage.BinarySearch;

/*
This Algorithm will improve the algorithm which finds three numbers that have Zero-sum before.
This Algorithm use BinarySearch Algorithm to make.
*/

public class TripletsZeroSum2 {
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


        /*
        The same to the algorithm before in the first two steps. we still use two loops with i and j.
        the difference is appeared when we find the last number k so that arr[k] = -(arr[i] + arr[j]).
        */

        BinarySearch bs = new BinarySearch();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int lastest_number = - (arr[i] + arr[j]);
                int lastest_number_index = bs.BinarySearch(arr, lastest_number);
                if (lastest_number_index != -1) {
                    System.out.println(arr[i] + " " + arr[j] + " " + lastest_number);
                }
            }
        }

        sc.close();
    }
}