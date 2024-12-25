import java.util.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        boolean[] visited = new boolean[arr.length];
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || arr[i] == sorted[i]) continue;

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = Arrays.binarySearch(sorted, arr[j]);
                cycleSize++;
            }

            swaps += (cycleSize - 1);
        }
        return swaps;
    }
}
