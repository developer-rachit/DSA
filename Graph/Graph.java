import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adjacencyList;

    Graph(int V) {
        this.V = V;
        adjacencyList = new LinkedList[V];
        for(int i=0; i<V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }   

    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
        adjacencyList[w].add(v);
    }

    void printGraph() {
        for(int i=0; i<V; i++) {
            System.out.print(i + " -> ");
            for(Integer vertex : adjacencyList[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int V = 5;
        Graph graph = new Graph(V);

        // adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 2);

        // printing graph
        graph.printGraph();
    }
}