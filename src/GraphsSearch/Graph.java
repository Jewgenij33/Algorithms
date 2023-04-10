package GraphsSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);
//        g.addEdge(4,3);
//        g.addEdge(2,3);

        System.out.println();
        System.out.println("Following is Depth First Traversal");

        g.DFS(2);
    }

        private LinkedList<Integer> adjList[];
        private boolean visited[];
//create Graph
        Graph (int vertices){
            adjList = new LinkedList[vertices];
            visited = new boolean[vertices];

            for (int i = 0; i < vertices; i++)
                adjList[i] = new LinkedList<Integer>();
        }

        //add Edges
        void addEdge(int src, int dest){
            adjList[src].add(dest);
        }

        //algorithm
        void DFS(int vertex){
            visited[vertex] = true;
            System.out.println(vertex + " ");

            Iterator<Integer> ite = adjList[vertex].listIterator();
            while (ite.hasNext()){
                int adj = ite.next();
                if (!visited[adj])
                    DFS(adj);
            }
        }
    }
