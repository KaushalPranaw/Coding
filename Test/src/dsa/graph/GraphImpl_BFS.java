package dsa.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphImpl_BFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of vertex");
        int v = scanner.nextInt();
        System.out.println("Enter no of edge");
        int e = scanner.nextInt();

        int adj_mat[][] = new int[v][v];

        for (int i = 0; i < e; i++) {
            int sv = scanner.nextInt();
            int ev = scanner.nextInt();
            adj_mat[sv][ev] = 1;
            adj_mat[ev][sv] = 1;
        }

        printBFS(adj_mat);

    }

    private static void printBFS(int[][] adj_mat) {
        int v = adj_mat.length;
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                printBFSHelper(adj_mat, i, visited);
            }
        }
    }

    private static void printBFSHelper(int[][] adj_mat, int sv, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        visited[sv] = true;
        int v = adj_mat.length;
        while (!q.isEmpty()) {
            int front = q.poll();
            System.out.println(front);
            visited[front] = true;
            for (int i = 0; i < v; i++) {
                if (adj_mat[front][i] == 1 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }


    }
}
