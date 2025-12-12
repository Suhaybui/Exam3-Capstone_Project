package capstone;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    String value;
    List<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String value) {
        this.value = value;
    }

    public void addNeighbor(GraphNode node) {
        neighbors.add(node);
    }
}
