package capstone;

public class Main {
    public static void main(String[] args) {
        GraphNode A = new GraphNode("A");
        GraphNode B = new GraphNode("B");
        GraphNode C = new GraphNode("C");
        GraphNode D = new GraphNode("D");

        A.addNeighbor(B);
        B.addNeighbor(C);
        C.addNeighbor(D);

        Graph graph = new Graph();

        System.out.println(graph.hasPathDFS(A, D));
        System.out.println(graph.hasPathDFS(D, A));
    }
}
