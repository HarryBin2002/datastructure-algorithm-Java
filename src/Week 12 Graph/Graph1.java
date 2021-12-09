// Adjacency Matrix representation
// Weighted and Directed Graph

import java.util.ArrayList;

public class Graph1 {
    private int numVertices;
    private int[][] adjMatrix;

    Graph1(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    private void addVertix() {

    }

    private void removeVertix() {

    }

    private void addEdge(int v1, int v2, int w) {
        // Directed Graph, we set the direction start at v1 and end at v2 with weight is w
        adjMatrix[v1][v2] = w;
    }

    private void removeEdge(int v1, int v2, int w) {
        // Direction: v1 -> v2 with weight is w
        adjMatrix[v1][v2] = 0;
    }

    private boolean hasEdgeBetween(int v1, int v2) {
        return adjMatrix[v1][v2] > 0;
    }

    private ArrayList<Integer> getAdjVertices(int v) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if ((hasEdgeBetween(v, i) == true) || (hasEdgeBetween(i, v) == true)) {
                arr.add(i);
            }
        }
        return arr;
    }

    private void printGraph() {
        System.out.println("Graph flow Adjacency Array");

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numVertices; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            a = getAdjVertices(i);
            System.out.print("Vertix " + i + " leads to : ");
            for (int u : a) {
                System.out.print(u + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph1 g1 = new Graph1(5);

        g1.addEdge(0, 1, 10);
        g1.addEdge(0, 3, 11);
        g1.addEdge(1, 3, 15);
        g1.addEdge(1, 4, 18);
        g1.addEdge(3, 2, 100);
        g1.addEdge(4, 0, 123);
        g1.addEdge(4, 2, 321);

        g1.printGraph();


    }


}