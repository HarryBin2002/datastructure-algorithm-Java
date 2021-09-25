import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import binarypackage.BinarySearch;

public class TestBinarySearch {
    public static void main(String[] args) throws FileNotFoundException {

        // Create File method to get data from text file
        File file = new File("D:\\DSA-Java\\src\\Week 3 Analysis of Algorithms\\InputDataTest.txt");
        Scanner sc = new Scanner(file);

        // create array to store data
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 0;
        while (sc.hasNext()) {
            arr[x++] = sc.nextInt();
        }

        // get value for key from keyboard
        Scanner sc1 = new Scanner(System.in);
        int key = sc1.nextInt();

        // call BinarySearch function and pass argument by reference
        BinarySearch bs = new BinarySearch();
        int result = bs.BinarySearch(arr, key);

        System.out.println(result);

        sc1.close();
        sc.close();
    }
}