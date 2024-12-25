import java.util.*;

public class Dijkstra {
    static class Edge {
        int dest, weight;
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());

        // Example edges
        graph.get(0).add(new Edge(1, 9));
        graph.get(0).add(new Edge(2, 6));
        graph.get(0).add(new Edge(3, 5));
        graph.get(0).add(new Edge(4, 3));
        graph.get(2).add(new Edge(1, 2));
        graph.get(2).add(new Edge(3, 4));

        dijkstra(graph, vertices, 0);
    }

    static void dijkstra(List<List<Edge>> graph, int vertices, int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0;

        pq.add(new Edge(start, 0));
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            for (Edge edge : graph.get(current.dest)) {
                int newDist = distances[current.dest] + edge.weight;
                if (newDist < distances[edge.dest]) {
                    distances[edge.dest] = newDist;
                    pq.add(new Edge(edge.dest, newDist));
                }
            }
        }

        System.out.println("Shortest distances: " + Arrays.toString(distances));
    }
}
 
