package capstone;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    public boolean hasPathDFS(GraphNode start, GraphNode target) {
        return dfs(start, target, new HashSet<>());
    }

    private boolean dfs(GraphNode current, GraphNode target, Set<GraphNode> visited) {
        if (current == target) return true;
        visited.add(current);
        for (GraphNode neighbor : current.neighbors) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, target, visited)) return true;
            }
        }
        return false;
    }
}
