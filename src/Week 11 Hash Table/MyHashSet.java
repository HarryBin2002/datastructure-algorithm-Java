import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBucket[];

    MyHashSet() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    // return HashValue (index of bucket)
    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void add(int key) {
        // Hashing
        int hashValueIndex = hashFunction(key);
        //Checking key in bucket or not
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    private void remove(int key) {
        // Hashing
        int hashValueIndex = hashFunction(key);
        //Checking key in bucket or not
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    private boolean contains(int key) {
        // Hashing
        int hashValueIndex = hashFunction(key);
        //Checking key in bucket or not
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashSet myhs = new MyHashSet();

        myhs.add(1);
        myhs.add(2);
        myhs.add(1);
        myhs.add(3);
        myhs.add(4);


        myhs.remove(3);

        System.out.println(myhs.contains(3));

    }
}