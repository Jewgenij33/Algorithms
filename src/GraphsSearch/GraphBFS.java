package GraphsSearch;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

    //total number of nodes in the graph
    private int node;

    //adjacency list
    private LinkedList<Integer> adj[];

    //maintaining a queue
    private Queue<Integer> que;

    GraphBFS(int v){
        node = v;
        adj = new LinkedList[node];
        for(int i=0; i<node; i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    void insertEdge(int v, int w){
        //adding an edge ti tge adjacency list (edges are bidirectional in this example)
        adj[v].add(w);
    }

    void BFS (int n){
        //initialize boolean array for holding the data
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        //root node is added to the top of the queue
        que.add(n);

        while (que.size()!=0){
            //remove the top element of the queue
            n = que.poll();

            //print the top element
            System.out.println(n + " ");

            //iterate through the linked list and push all neighbors into queue
            for(int i = 0; i < adj[n].size(); i++){
                a = adj[n].get(i);

                //only insert nodes into queue if they have nor been explored already
                if(!nodes[a]){
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(6);

        g.insertEdge(0,1);
        g.insertEdge(0,3);
        g.insertEdge(0,4);
        g.insertEdge(4,5);
        g.insertEdge(3,5);
        g.insertEdge(1,2);
        g.insertEdge(1,0);
        g.insertEdge(2,1);
        g.insertEdge(4,1);
        g.insertEdge(3,1);
        g.insertEdge(5,4);
        g.insertEdge(5,3);

        System.out.println("Breadth First Traversal for the graph is:");
        g.BFS(0);
    }
}
