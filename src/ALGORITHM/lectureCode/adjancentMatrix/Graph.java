package ALGORITHM.lectureCode.adjancentMatrix;
import java.util.ArrayList;


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
}
