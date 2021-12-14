package week12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Algorithm {

    // Unweighted - Undirected Graph
    public static class Graph_test {
        private int numVertices;
        private ArrayList<Integer> myBucket[];
        private Queue<Integer> queue;

        Graph_test(int num) {
            this.numVertices = num;
            myBucket = new ArrayList[numVertices];
            for (int i = 0; i < numVertices; i++) {
                myBucket[i] = new ArrayList<>();
            }
            queue = new LinkedList<>();
        }

        private void addEdge(int v1, int v2) {
            var bucket1 = myBucket[v1];
            bucket1.add(v2);

            var bucket2 = myBucket[v2];
            bucket2.add(v1);
        }

        private void BFS(int v) {

            boolean visited[] = new boolean[numVertices]; // Mark vertix is visited.

            queue.add(v); // Give the source vertix into queue
            visited[v] = true; // Mark vertix is visited.

            while (queue.size() != 0) {
                int n = queue.poll(); // Get vertix
                System.out.print(n + " ");

                // Traversal adjacency of this vertix.
                for (int i = 0; i < myBucket[n].size(); i++) {
                    var bucket = myBucket[n];
                    int x = bucket.get(i);

                    if (visited[x] == false) {
                        visited[x] = true;
                        queue.add(x);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph_test gt = new Graph_test(5);

        gt.addEdge(0, 1);
        gt.addEdge(0, 3);
        gt.addEdge(0, 4);
        gt.addEdge(1, 3);
        gt.addEdge(1, 4);
        gt.addEdge(2, 3);
        gt.addEdge(2, 4);

        gt.BFS(0);

    }
}