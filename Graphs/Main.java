package Graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        
        graph.printGraph();

        System.out.println("Edge between 0 and 1: " + graph.checkEdge(0, 1));
        System.out.println("Edge between 1 and 3: " + graph.checkEdge(1, 3));
        System.out.println("Edge between 3 and 0: " + graph.checkEdge(3, 0));
    }
}