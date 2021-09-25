package binarypackage;
public class BinarySearch {
    // Binary search algorithm
    /*
    step 1: get the first element of array as head and the last element of array as tail
    step 2: get middle by mid = head + (tail - head)/2
    step 3: compare between key and mid
            if key is less than mid so move tail to the left of mid
            if key is greater than mid so move head to the right of mid
            remaining if key equal to mid, so we had the result is mid.
    */

    public int BinarySearch(int[] arr, int key) {
        int head = 0;
        int tail = arr.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head)/2;
            if (key < arr[mid]) tail = mid - 1;
            else if (key > arr[mid]) head = mid + 1;
            else return mid;
        }
        return -1;
    }
}