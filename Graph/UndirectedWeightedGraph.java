import java.util.*;

public class UndirectedWeightedGraph {
    private int V;
    private LinkedList<Edge>[] adjList; 

    class Edge {
        int weight;
        int destination;

        Edge(int w, int d) {
            this.destination = d;
            this.weight = w;
        }
    }

    UndirectedWeightedGraph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for(int i=0; i<V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int d, int w) {
        adjList[v].add(new Edge(w, d));
        adjList[w].add(new Edge(v, d));
    }

    void printGraph() {
        for(int i=0; i<V; i++) {
            System.out.print(i + " -> ");
            for(Edge vertex : adjList[i]) {
                System.out.print(vertex.destination + " (Weight: " + vertex.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        UndirectedWeightedGraph wg = new UndirectedWeightedGraph(V);

        wg.addEdge(0, 1, 2);
        wg.addEdge(0, 4, 3);
        wg.addEdge(1, 2, 3);
        wg.addEdge(1, 3, 1);
        wg.addEdge(1, 4, 4);
        wg.addEdge(2, 3, 3);
        wg.addEdge(3, 4, 4);

        wg.printGraph();
    }

}
