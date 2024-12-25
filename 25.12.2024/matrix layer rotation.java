import java.util.ArrayList;
import java.util.List;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int rotations = 2;
        rotateMatrix(matrix, rotations);
    }

    static void rotateMatrix(int[][] matrix, int rotations) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<List<Integer>> layers = new ArrayList<>();

        // Extract layers
        for (int layer = 0; layer < Math.min(m, n) / 2; layer++) {
            List<Integer> currentLayer = new ArrayList<>();
            for (int i = layer; i < n - layer; i++) currentLayer.add(matrix[layer][i]);
            for (int i = layer + 1; i < m - layer; i++) currentLayer.add(matrix[i][n - layer - 1]);
            for (int i = n - layer - 2; i >= layer; i--) currentLayer.add(matrix[m - layer - 1][i]);
            for (int i = m - layer - 2; i > layer; i--) currentLayer.add(matrix[i][layer]);
            layers.add(currentLayer);
        }

        // Rotate each layer
        for (int layer = 0; layer < layers.size(); layer++) {
            List<Integer> currentLayer = layers.get(layer);
            int layerSize = currentLayer.size();
            List<Integer> rotatedLayer = new ArrayList<>(currentLayer);

            for (int i = 0; i < layerSize; i++) {
                rotatedLayer.set((i + layerSize - rotations % layerSize) % layerSize, currentLayer.get(i));
            }
            layers.set(layer, rotatedLayer);
        }

        // Place rotated layers back
        for (int layer = 0; layer < layers.size(); layer++) {
            List<Integer> currentLayer = layers.get(layer);
            int index = 0;
            for (int i = layer; i < n - layer; i++) matrix[layer][i] = currentLayer.get(index++);
            for (int i = layer + 1; i < m - layer; i++) matrix[i][n - layer - 1] = currentLayer.get(index++);
            for (int i = n - layer - 2; i >= layer; i--) matrix[m - layer - 1][i] = currentLayer.get(index++);
            for (int i = m - layer - 2; i > layer; i--) matrix[i][layer] = currentLayer.get(index++);
        }

        // Print rotated matrix
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
