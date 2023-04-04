import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge {

    int src, dest;

    Edge(int src, int dest){
        this.src = src;
        this.dest = dest;
    }
}

// class for provision of an object
public class Graph {

    // list of lists for provision of an object
    List<List<Integer>> adjList = new ArrayList<>();

    //graph's constructor
    public Graph(List<Edge> edges) {

        //find the vertex with the maximum number
        int n = 0;
        for (Edge e : edges) {
            n = Integer.max(n, Integer.max(e.src, e.dest));
        }

        //allocate memory for list
        for (int i = 0; i <= n; i++) {
            adjList.add(i, new ArrayList<>());
        }

        //adding edges in oriented graph
        for (Edge current : edges) {

            //select a new node in the adjacency list from 'src' to 'dest'
            adjList.get(current.src).add(current.dest);

        }
    }

    //function for print
    public static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adjList.size();

        while (src < n) {
            for (int dest : graph.adjList.get(src)) {
                System.out.println("(" + src + " --> " + dest + ")\t");
            }
            System.out.println();
            src++;
        }
    }
}
    class Main {
        public static void main(String[] args) {
List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge (1,2),
                                new Edge(2,0), new Edge(2,1),
                                new Edge(3,2), new Edge(4,5),
                                new Edge(5,4));

Graph graph = new Graph(edges);
Graph.printGraph(graph);
        }
    }

