package ALGORITHM.lectureCode.adjancentMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphComponents {

    /**
     * Finds all connected components of a graph using Depth-First Search (DFS).
     *
     * @param adjMatrix The adjacency matrix of the graph.
     * @return A list of lists, where each inner list represents a connected component.
     */
    public static List<List<Integer>> findComponentsDFS(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        List<List<Integer>> components = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(adjMatrix, i, visited, component);
                components.add(component);
            }
        }
        return components;
    }

    private static void dfs(int[][] adjMatrix, int startNode, boolean[] visited, List<Integer> component) {
        visited[startNode] = true;
        component.add(startNode);

        for (int neighbor = 0; neighbor < adjMatrix.length; neighbor++) {
            if (adjMatrix[startNode][neighbor] == 1 && !visited[neighbor]) {
                dfs(adjMatrix, neighbor, visited, component);
            }
        }
    }

    /**
     * Finds all connected components of a graph using Breadth-First Search (BFS).
     *
     * @param adjMatrix The adjacency matrix of the graph.
     * @return A list of lists, where each inner list represents a connected component.
     */
    public static List<List<Integer>> findComponentsBFS(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        List<List<Integer>> components = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                bfs(adjMatrix, i, visited, component);
                components.add(component);
            }
        }
        return components;
    }

    private static void bfs(int[][] adjMatrix, int startNode, boolean[] visited, List<Integer> component) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.add(startNode);
        component.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            for (int neighbor = 0; neighbor < adjMatrix.length; neighbor++) {
                if (adjMatrix[currentNode][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    component.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // The graph is represented by its adjacency matrix.
               //A  B  C  D  E  F  G  H  I
        int[][] adjMatrix = {
                {0, 1, 1, 0, 0, 1, 0, 0, 0},    // A
                {1, 0, 0, 0, 0, 1, 0, 0, 0},    // B
                {1, 0, 0, 0, 0, 1, 1, 0, 0},    // C
                {0, 0, 0, 0, 1, 0, 0, 0, 1},    // D
                {0, 0, 0, 1, 0, 0, 0, 0, 1},    // E
                {1, 1, 1, 0, 0, 0, 0, 1, 0},    // F
                {0, 0, 1, 0, 0, 0, 0, 1, 0},    // G
                {0, 0, 0, 0, 0, 1, 1, 0, 0},    // H
                {0, 0, 0, 1, 1, 0, 0, 0, 0}     // I
        };

        System.out.println("Using DFS to find components:");
        List<List<Integer>> componentsDFS = findComponentsDFS(adjMatrix);
        System.out.println(componentsDFS); // Expected: [[0, 1, 2], [3, 4]]

        System.out.println("\nUsing BFS to find components:");
        List<List<Integer>> componentsBFS = findComponentsBFS(adjMatrix);
        System.out.println(componentsBFS); // Expected: [[0, 1, 2], [3, 4]]
    }
}
