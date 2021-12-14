package week12;
// Edge List representation
// Unweighted - Undirected Graph

import java.util.ArrayList;

public class Graph8 {

    private class Node {
        int v1;
        int v2;

        Node(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Node) {
                return (this.v1 == ((Node)other).v1) && (this.v2 == ((Node)other).v2);
            }
            return false;
        }
    }

    private int numEdges;
    private ArrayList<Node> edgeList;

    Graph8(int numEdges) {
        this.numEdges = numEdges;
        edgeList = new ArrayList<Node>();
    }

//    private void addVertix(int v)
//    private void removeVertix(int v)

    private void addEdge(int v1, int v2) {
        Node temp = new Node(v1, v2);
        edgeList.add(temp);
    }

    private void removeEdge(int v1, int v2) {
        Node temp = new Node(v1, v2);
        edgeList.remove(temp);
    }

    private boolean hasEdgeBetween(int v1, int v2) {
        Node temp = new Node(v1, v2);
        return edgeList.indexOf(temp) >= 0;
    }

    private ArrayList<Integer> getAdjVertices(int v) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node n : edgeList) {
            if (n.v1 == v) {
                arr.add(n.v2);
            } else if (n.v2 == v) {
                arr.add(n.v1);
            }
        }
        return arr;
    }

    private void printGraph() {
        for (Node n : edgeList) {
            System.out.println("The Edge between " + n.v1 + " and " + n.v2);
        }
    }

    public static void main(String[] args) {
        Graph8 g8 = new Graph8(7);

        g8.addEdge(0, 1);
        g8.addEdge(0, 3);
        g8.addEdge(1, 3);
        g8.addEdge(1, 4);
        g8.addEdge(3, 2);
        g8.addEdge(4, 0);
        g8.addEdge(4, 2);

        g8.printGraph();

        ArrayList<Integer> test = g8.getAdjVertices(3);
        for (int x : test) {
            System.out.print(x + " ");
        }

        System.out.println(g8.hasEdgeBetween(1, 3));
        System.out.println(g8.hasEdgeBetween(1, 2));
    }

}