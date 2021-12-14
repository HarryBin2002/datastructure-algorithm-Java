package week12;
// Adjacency Matrix representation
// Unweighted - Undirected Graph

import java.util.ArrayList;

public class Graph4 {
    private int numVertices;
    private int[][] adjMatrix;

    // Inlitialize the matrix
    Graph4(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

//    private void addVertice() {
//        int newNumVertices = numVertices++;
//        int[][] newAdjMatrix = new int[newNumVertices][newNumVertices];
//
//        for (int i = 0; i < numVertices; i++) {
//            for (int j = 0; j < numVertices; j++) {
//                newAdjMatrix[i][j] = adjMatrix[i][j];
//            }
//        }
//
//        for (int i = 0; i < newNumVertices; i++) {
//            newAdjMatrix[i][newNumVertices-1] = 0;
//            newAdjMatrix[newNumVertices-1][i] = 0;
//        }
//
//        adjMatrix = newAdjMatrix;
//    }

//    private void removeVertice(int v) {
//
//    }

    private void addEdge(int v1, int v2) {
        adjMatrix[v1][v2] = 1;
        adjMatrix[v2][v1] = 1;
        // Because it's undirected graph, [i][j] = [j][i]
    }

    private void removeEdge(int v1, int v2) {
        adjMatrix[v1][v2] = 0;
        adjMatrix[v2][v1] = 0;
        // Because it's undirected graph, [i][j] = [j][i]
    }

    private boolean hasEdgebetween(int v1, int v2) {
        return adjMatrix[v1][v2] == 1;
    }

    private ArrayList<Integer> getAdjVertices(int v) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < numVertices; i++) {
            if(hasEdgebetween(i, v) == true) {
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
            System.out.print("Vertix " + i + " is connected with: ");
            for (int u : a) {
                System.out.print(u + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph4 g4 = new Graph4(5);

        g4.addEdge(0, 1);
        g4.addEdge(0, 3);
        g4.addEdge(1, 3);
        g4.addEdge(1, 4);
        g4.addEdge(3, 2);
        g4.addEdge(4, 0);
        g4.addEdge(4, 2);


        g4.printGraph();

        System.out.println(g4.hasEdgebetween(1, 3));

//        g4.addVertice();

    }
}