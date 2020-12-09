import java.io.*;
import java.util.*;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list 

class ECircuit 
{
    private int V; // No. of vertices 
    private LinkedList<Integer> adj[]; // Adjacency list 
    private int in[]; // maintaining in degree


 
    //constructor 

        ECircuit(int v)
        {
            V = v; 
            adj = new LinkedList[v]; //array of LL
            in = new int[V];
            
            for(int i =0; i < v; ++i)
            {
                adj[i] = new LinkedList();
                in[i] = 0; 
            }
        }


        // Function to add an edge into the graph 

        void addEdge(int V, int W)
        {
            adj[V].add(W);
            int[w]++; 
        }

        void DFS(int v, Boolean visited[])
        {
            visited[v] = true; 
            int n;

            Iterator<Integer> i = adj[v].iterator();

            while(i.hasNext())

            {
                n = i.hasNext();
                if( !visited[n])
                {
                    DFS( n, visited);
                    // print out n or push it onto the stack 
                }
            }
        }




        Boolean isSC()
        {
            // All nodes are not visited 
            Boolean visited[] = new Boolean[V];

            for(int i = 0; i < V; i++)
                visited[i] = false; 

                DFS(0, visited);


            for(int i =0; i < V; i++)
                    if(visited[i] == false)
                        return false; 

            ECircuit tgraph = new Ecircuit(V);

            for(int node =0; node < V; node++)
            {
                Iterator<Integer>i = adj[node].listIterator();
            
            while(i.hasNext())
            {
                tgraph.adj[i.next()}.add(node);
                (tgraph.in[node])++; 
            }

            for(int i =0; i < V; i++)
                visited[i] = false; 
            
            tgraph.DFS(0, visited);
            
            
            for(int i =0; i < V; i++)
                if(visited[i] == false)
                    return false;
            
            return true; 


        }



        Boolean isEulerianCycle()
        {   //check if all non-zero degree nodes are connected
            if(isSC() == false)
                return false; 

            for(int i =0; i < V; i++)
            {
                if(adj[i].size() != in[i])
                    return false; 
            }

            return true; 
        }

    }

    public static void main(String args[]) 
    {
    
        ECircuit g = new E(5); 
        g.addEdge(1,0);
        g.addEdge(0,2);
        g.addEdge(2,1);
        g.addEdge(3,4);
        g.addEdge(0,3);
        g.addEdge(4,0);
    
        if(g.isEulerianCycle()){
            System.out.println("Given the directed graph there is a eulerian cycle");
            else
            System.out.println("Given the directed graph there is not a eulerian cycle"); 
        }
        
    }

}
