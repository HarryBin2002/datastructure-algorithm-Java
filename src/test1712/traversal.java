import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class traversal {

    public static class Graph_test {
        private int numVertices;
        private ArrayList<Integer> myBucket[];
        private Queue<Integer> queue;

        Graph_test(int num) {
            this.numVertices = num;
            myBucket = new ArrayList[numVertices+1];
            for (int i = 1; i <= numVertices; i++) {
                myBucket[i] = new ArrayList<>();
            }
            queue = new LinkedList<>();
        }

        private void addEdge(int v1, int v2) {
            ArrayList<Integer> bucket1 = myBucket[v1];
            bucket1.add(v2);

            ArrayList<Integer> bucket2 = myBucket[v2];
            bucket2.add(v1);
        }

        // DFS algorithm
        private void DFS_Recursive(int source, boolean[] visited) {
            visited[source] = true;
            System.out.print(source + " ");
            for (int x : myBucket[source] ) {
                if (visited[x] == false) {
                    DFS_Recursive(x, visited);
                }
            }
        }

        public void DFS(int source) {
            boolean[] visited = new boolean[numVertices+1];
            DFS_Recursive(source, visited);
        }


        // BFS
        private void BFS(int v) {

            boolean visited[] = new boolean[numVertices+1]; // Mark vertix is visited.

            queue.add(v); // Give the source vertix into queue
            visited[v] = true; // Mark vertix is visited.

            while (queue.size() != 0) {
                int n = queue.poll(); // Get vertix
                System.out.print(n + " ");

                // Traversal adjacency of this vertix.
                for (int i = 0; i < myBucket[n].size(); i++) {
                    ArrayList<Integer> bucket = myBucket[n];
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
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Graph_test gt = new Graph_test(n);

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            gt.addEdge(u, v);
        }

        gt.DFS(1);
        System.out.println();
        gt.BFS(1);

        sc.close();
    }
}