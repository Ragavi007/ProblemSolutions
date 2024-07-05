package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {

	static int vertices=6;
	
	static boolean[] visited=new boolean[vertices];
	
	static LinkedList<Integer> adj[]=new LinkedList[vertices]; 
	
	static Stack<Integer> st=new Stack<>();
	
	static void addEdge(int v1,int v2)
	{
		adj[v1].add( v2);
	}
	
	static void topologicalSort(int i)
	{
		 visited[i]=true;
		 
		 Iterator it=adj[i].iterator();
		 
		 while(it.hasNext())
		 {
			 int n=(int) it.next();
			 if(!visited[n])
				 topologicalSort(n);
		 }
		 st.push( i);
	}
	
	public static void main(String[] args) {
		 
		
		for(int i=0;i<vertices;i++)
			adj[i]=new LinkedList();
			 
		addEdge(5, 2);  
        addEdge(5, 0);  
        addEdge(4, 0);  
        addEdge(4, 1);  
        addEdge(2, 3);  
        addEdge(3, 1); 
		 
		for(int i=0;i<vertices;i++)
			if(!visited[i])
				topologicalSort(i);
		
		
		while(!st.isEmpty())
		{
			System.out.println(st.peek()+" ");
			st.pop();
		}
		
	}

}
