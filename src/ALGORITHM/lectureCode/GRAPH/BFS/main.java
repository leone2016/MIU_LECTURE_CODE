package ALGORITHM.lectureCode.GRAPH.BFS;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodesList = new ArrayList<>();
        nodesList.add(new GraphNode("A", 0));
        nodesList.add(new GraphNode("B", 1));
        nodesList.add(new GraphNode("C", 2));
        nodesList.add(new GraphNode("D", 3));
        nodesList.add(new GraphNode("E", 4));

        Graph graph = new Graph(nodesList);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(0, 3);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 4);
        graph.BFS();
        System.out.println(graph);

    }
}
