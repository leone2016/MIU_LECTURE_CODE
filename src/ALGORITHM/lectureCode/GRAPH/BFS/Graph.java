package ALGORITHM.lectureCode.GRAPH.BFS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;


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
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode currNode = queue.remove(0);
            currNode.visited = true;
            System.out.println(currNode.name+ " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currNode);
            for (int i = 0; i < neighbors.size(); i++) {
                if (!neighbors.get(i).visited) {
                    queue.add(neighbors.get(i));
                    neighbors.get(i).visited = true;
                }
            }
        }
    }

    public void BFS() {
        for(GraphNode node: nodeList){
            if(!node.visited){
                bfsVisit(node);
            }

        }
    }
}
