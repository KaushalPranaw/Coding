package dsa.graph;

import java.util.Scanner;

public class GraphImpl_DFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of vertex");
        int v = scanner.nextInt();
        System.out.println("Enter no of edge");
        int e = scanner.nextInt();

        //created adjacent matrix
        int adj_max[][] = new int[v][v];

        //populate adjacent matrix
        for (int i = 0; i < e; i++) {
            int sv = scanner.nextInt();
            int ev = scanner.nextInt();
            adj_max[sv][ev] = 1;
            adj_max[ev][sv] = 1;
        }

        print(adj_max);

    }

    private static void print(int[][] adj_max) {
        int v = adj_max.length;
        //otherwise infinite loop me jayega
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                printHelper(adj_max, i, visited);
            }
        }

    }

    //to print each component
    private static void printHelper(int[][] adj_max, int sv, boolean[] visited) {

        System.out.println(sv);
        visited[sv] = true;
        int v = adj_max.length;
        for (int i = 0; i < v; i++) {
            if (adj_max[sv][i] == 1 && visited[i] == false) {
                printHelper(adj_max, i, visited);
            }
        }
    }
}
