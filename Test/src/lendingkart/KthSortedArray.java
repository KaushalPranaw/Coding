package lendingkart;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 7, 6, 9, 8};
        int k = 2;
        nearlySorted(arr, k);
    }

    private static void nearlySorted(int[] arr, int k) {
        int n = arr.length;
        int result[] = new int[n];
        int resultIndex = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <= k && i < n; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k + 1; i < n; i++) {
            result[resultIndex++] = minHeap.poll();
            minHeap.add(arr[i]);
        }
        while (!minHeap.isEmpty()) {
            result[resultIndex++] = minHeap.poll();
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
