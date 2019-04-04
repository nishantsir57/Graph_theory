import java.io.*;
import java.util.*;
class solution
{
    static class Graph
    {
        int Vertex;
        LinkedList<Integer> adjArray[];
        Graph(int Vertex)
        {
            this.Vertex=Vertex;
            adjArray=new LinkedList[Vertex];
            for(int i=0;i<Vertex;i++)
            {
                adjArray[i]=new LinkedList<>();
            }
        }
    }
    static void addEdge(Graph graph, int source, int destination)
    {
        graph.adjArray[source].add(destination);
        graph.adjArray[destination].add(source);
    }
    static void printGraph(Graph graph)
    {
        for(int v=0;v<graph.Vertex;v++)
        {
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjArray[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n");
        }
    }
}
