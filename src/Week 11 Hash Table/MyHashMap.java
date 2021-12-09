import java.util.ArrayList;

public class MyHashMap {

    private class Data {
        int key;
        int frequencyKey;

        Data(int key, int frequencyKey) {
            this.key = key;
            this.frequencyKey = frequencyKey;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Data) {
                return this.key == ((Data)other).key;
            }
            return false;
        }
    }

    private final int SIZE = 1000;
    private ArrayList<Data> myBucket[];

    MyHashMap() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void put(int key, int frequencyKey) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, frequencyKey);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0) {
            bucket.get(keyIndex).frequencyKey = frequencyKey;
        } else {
            bucket.add(newData);
        }
    }

    private void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data removeData = new Data(key, 0);
        bucket.remove(removeData);
    }

    private int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data getData = new Data(key, 0);
        int keyIndex = bucket.indexOf(getData);
        if (keyIndex >= 0) {
            return bucket.get(keyIndex).frequencyKey;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyHashMap mhm = new MyHashMap();

        mhm.put(1, 1);
        mhm.put(1, 2);
        mhm.put(2, 2);
        mhm.put(3, 2);

        System.out.println(mhm.get(1));
        System.out.println(mhm.get(2));

        mhm.remove(1);

        System.out.println(mhm.get(1));
        System.out.println(mhm.get(3));

    }
}