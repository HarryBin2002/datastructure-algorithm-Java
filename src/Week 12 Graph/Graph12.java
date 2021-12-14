package week12;
/*
Adjacency List representation
Unweighted and Undirected Graph
*/

import java.util.ArrayList;

public class Graph12 {
    private int numVertices;
    private ArrayList<Integer> myBucket[];

    Graph12(int numVertices) {
        this.numVertices = numVertices;
        myBucket = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int vertix) {
        // Because this parameter is also index of bucket in Mybucket List
        return vertix;
    }

//    private Graph12 addVertix(int v) {
//    }
//
//    private void removevertix() {
//    }

    private void addEdge(int v1, int v2) {
        int hashValueIndex1 = hashFunction(v1);
        var bucket1 = myBucket[hashValueIndex1];
        bucket1.add(v2);

        int hashValueIndex2 = hashFunction(v2);
        var bucket2 = myBucket[hashValueIndex2];
        bucket2.add(v1);
    }

    private void removeEdge(int v1, int v2) {
        int hashValueIndex1 = hashFunction(v1);
        var bucket1 = myBucket[hashValueIndex1];
        int indexOfV2 = bucket1.indexOf(v2);
        bucket1.remove(indexOfV2);

        int hashValueIndex2 = hashFunction(v2);
        var bucket2 = myBucket[hashValueIndex2];
        int indexOfV1 = bucket2.indexOf(v1);
        bucket2.remove(indexOfV1);
    }

    private boolean hasEdgeBetween(int v1, int v2) {
        // Undirected so We only check that v2 in bucket of v1 or v1 in bucket of v2.
        int hashValueIndex = hashFunction(v1);
        var bucket = myBucket[hashValueIndex];
        int indexOfV2 = bucket.indexOf(v2);
        return indexOfV2 >= 0;
    }

    private ArrayList<Integer> getAdjVertices(int v) {
        int hashValueIndex = hashFunction(v);
        var bucket = myBucket[hashValueIndex];
        return bucket;
    }

    private void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vertix " + i + " is connected with: ");
            ArrayList<Integer> arr = getAdjVertices(i);
            for (int a : arr) {
                System.out.print(a + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph12 g12 = new Graph12(5);

        g12.addEdge(0, 1);
        g12.addEdge(0, 3);
        g12.addEdge(1, 3);
        g12.addEdge(1, 4);
        g12.addEdge(3, 2);
        g12.addEdge(4, 0);
        g12.addEdge(4, 2);


        g12.printGraph();

//        g12.removeEdge(3, 2);
//
//        g12.printGraph();

    }

}