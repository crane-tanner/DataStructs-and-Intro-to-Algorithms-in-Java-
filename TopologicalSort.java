import java.io.*;

import java.util.*;

class Graph 

{

    // no. off vertices 
    private int V; 
    // Adjacency list 
    private ArrayList<ArrayList<Integer>> adjList; 

    public Graph(int v)
    {
        this.V = v; // class variable 

        this.adjList = new ArrayList<ArrayList<Integer>> (v);
        for(int i = 0; i < v; i++ )
        {
            this.adjList.add(new ArrayList<Integer>());
        }
    }

    public void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>(); 

        boolean visited[] = new boolean[V];
        for(int i =0; i < V; i++)
        {
            visited[i] = false; 
        }
        for(int i =0; i < V; i++)
        {
            if (visited[i] == false)
            {
                topologicalSortUtil(i, visited, stack); 
            }
        }

        while(stack.empty() == false)
        {
            System.out.print(stack.pop() + " ");
        }
    }

    public void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack)
    {
        visited[v] = true; 
        
        Integer i; 

        Iterator<Integer> it = adjList.get(v).iterator(); 
        
        while(it.hasNext())
        {
            i = it.next(); // recursively call 
            if(!visited[i])
            {
                topologicalSortUtil(i, visited, stack);
            }
        }

        stack.push(v);
    }

    public void addEdge(int u, int v)
    {

        adjList.get(u).add(v); //
    }


}

public class TopologicalSort
{
    public static void main(String args[]) 
    { // driver code 

        Graph g = new Graph(6);  
        g.addEdge(5,2);
        g.addEdge(5,0);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(2,3);
        g.addEdge(3,1);

        System.out.println("Printing in topological order: ");

        // 5 4 2 3 1 0 -- time complexity O(V + E)
        g.topologicalSort(); 
        
    }




}