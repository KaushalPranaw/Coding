package lendingkart;

public class WaterTrapProblem {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        maxWater(arr);
    }

    private static void maxWater(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int left_max = 0;
        int right_max = 0;
        int result = 0;
        while (left <= right) {
            if (right_max <= left_max) {
                result = result + Math.max(0, right_max - arr[right]);
                right_max = Math.max(right_max, arr[right]);
                right--;

            } else {
                result = result + Math.max(0, left_max - arr[left]);
                left_max = Math.max(left_max, arr[left]);
                left++;
            }
        }
        System.out.println(result);
    }
}
