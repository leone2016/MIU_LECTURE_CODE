package ALGORITHM.lectureCode.GRAPH.DFS;

import java.util.ArrayList;
import java.util.Stack;


public class Graph {
     ArrayList<GraphNode> nodeList = new ArrayList<>();
     int [][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int index1, int index2) {
        adjacencyMatrix[index1][index2] = 1;
        adjacencyMatrix[index2][index1] = 1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        // Encabezado con nombres de nodos
        s.append("  ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");

        // Filas de la matriz de adyacencia
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                s.append(adjacencyMatrix[i][j] + " ");
            }
            s.append("\n");
        }

        return s.toString();
    }

    //get Neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }
    //BFS internal
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.visited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.visited) {
                    stack.push(neighbor);
                    neighbor.visited = true;
                }
            }
        }
    }

    public void DFS() {
        for(GraphNode node: nodeList){
            if(!node.visited){
                dfsVisit(node);
            }

        }
    }
}
