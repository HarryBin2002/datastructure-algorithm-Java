public class RecursionBinarySearch {

    public static int recursion(int[] arr, int key, int low, int high) {
        int mid = low + (high - low) / 2;
        if (high < low) return -1;
        if (key < arr[mid]) return recursion(arr, key, low, mid-1);
        if (key > arr[mid]) return recursion(arr, key, mid + 1, high);
        return mid;
    }
}