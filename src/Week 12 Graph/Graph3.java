/*
Adjacency Matrix representation
Unweighted - Directed graph
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Graph3  {
    private final int numVertices;
    private int[][] adjMatrix;

    // Initialized the Matrix
    Graph3(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    private void addVertix() {

    }

    private void removeVertix(int v) {

    }

    private void addEdge(int v1, int v2) {
        // This's Directed Graph, Convention that this edge has direction from v1 to v2.
        // So The edge we add that v1->v2
        adjMatrix[v1][v2] = 1;
    }

    private void removeEdge(int v1, int v2) {
        // This's Directed Graph, Convention that this edge has direction from v1 to v2.
        // So the edge we delete that v1->v2
        adjMatrix[v1][v2] = 0;
    }

    private boolean hasEdgeBetween(int v1, int v2) {
        return adjMatrix[v1][v2] == 1;
    }

    private ArrayList<Integer> getAdjVertices(int v) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if (hasEdgeBetween(v, i) == true) {
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
        Graph3 g3 = new Graph3(5);

        g3.addEdge(0, 1);
        g3.addEdge(0, 3);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(3, 2);
        g3.addEdge(4, 0);
        g3.addEdge(4, 2);


        g3.printGraph();
        System.out.println(g3.hasEdgeBetween(0, 3));
    }

}