package week12;

import java.util.ArrayList;

public class DFS_Algorithm {

    public static class Graph_Test {
        private int numVertices;
        private ArrayList<Integer> myBucket[];

        Graph_Test(int num) {
            this.numVertices = num;
            myBucket = new ArrayList[numVertices];
            for (int i = 0; i < numVertices; i++) {
                myBucket[i] = new ArrayList<Integer>();
            }
        }

        private void addEdge(int v1, int v2) {
            var bucket1 = myBucket[v1];
            bucket1.add(v2);

            var bucket2 = myBucket[v2];
            bucket2.add(v1);
        }

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
            boolean[] visited = new boolean[numVertices];
            System.out.println("DFS Traversal the Graph: ");
            DFS_Recursive(source, visited);
        }
    }

    public static void main(String[] args) {
        Graph_Test gt = new Graph_Test(5);

        gt.addEdge(0, 1);
        gt.addEdge(0, 3);
        gt.addEdge(0, 4);
        gt.addEdge(1, 3);
        gt.addEdge(1, 4);
        gt.addEdge(2, 3);
        gt.addEdge(2, 4);

        gt.DFS(0);
    }
}