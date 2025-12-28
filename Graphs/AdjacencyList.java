package Graphs;

public class AdjacencyList {
    private Node[] nodes;
    private int[][] adjMatrix;
    private int nodeCount;

    public AdjacencyList(int size) {
        nodes = new Node[size];
        adjMatrix = new int[size][size];
        nodeCount = 0;
    }

    public void addNode(char data) {
        if (nodeCount < nodes.length) {
            nodes[nodeCount] = new Node(data);
            nodeCount++;
        }
    }

    public void addEdge(int from, int to) {
        adjMatrix[from][to] = 1;
        adjMatrix[to][from] = 1; // For undirected graph
    }

    public boolean checkEdge(int from, int to) {
        return adjMatrix[from][to] == 1;
    }

    public void printGraph() {
        for (int i = 0; i < nodeCount; i++) {
            System.out.print(nodes[i].data + ": ");
            for (int j = 0; j < nodeCount; j++) {
                if (adjMatrix[i][j] == 1) {
                    System.out.print(nodes[j].data + " ");
                }
            }
            System.out.println();
        }
    }
    
}
