package Graphs;

public class Graph {

    int[][] matrix;
    Node[] nodes;
    int nodeCount;
    
    Graph(int size) {
        matrix = new int[size][size];
        nodes = new Node[size];
        nodeCount = 0;
    }

    public void addNode(int from, int to) {
        matrix[from][to] = 1;
        matrix[to][from] = 1; // For undirected graph
    }
    public void addEdge(int from, int to) {
        matrix[from][to] = 1;
    }
    public boolean checkEdge(int from, int to) {
        if (matrix[from][to] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printGraph() {

        for(Node node : nodes) {
            if (node != null) {
                System.out.print(node.data + " ");
            }
        }
       



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addNode(Node node) {
        if (nodeCount < nodes.length) {
            nodes[nodeCount] = node;
            nodeCount++;
        }
    }

    
}
