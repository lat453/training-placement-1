import java.util.Arrays;

public class MaxMinProblem {
    public static void main(String[] args) {
        int[] arr = {10, 100, 300, 200, 1000, 20, 30};
        int k = 3;
        System.out.println(findMinDifference(arr, k));
    }

    static int findMinDifference(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array
        int minDifference = Integer.MAX_VALUE;

        // Sliding window to find the minimum difference
        for (int i = 0; i <= arr.length - k; i++) {
            int difference = arr[i + k - 1] - arr[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }
}
 max min problem
