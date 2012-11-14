package cmu.edu.jinguanz.crackingcode.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Vertex {
	private String label;
	public boolean wasVisited;

}

public class Graph {
	private final int MAX_VERTS=20;
	private Vertex vertexList[] = new Vertex[MAX_VERTS];
	private int adjMat[][]; //adjacency matrix
	private int nVerts;
	private Stack<Integer> stack = new Stack<Integer>();
	private Queue<Integer> queue = new Queue<Integer>();
	
	public int getAdjUnvisitedVertex(int v){
		for(int j=0;j<nVerts;j++){
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		}
		return -1;
	}
	
	public void dfs(){
		vertexList[0].wasVisited=true;
		display(vertexList[0]);
		stack.push(0);
		
		while(!stack.isEmpty()){
			int v = getAdjUnvisitedVertex(stack.peek());
			if(v==-1){  //no such vertex
				stack.pop();
			}else{
				vertexList[v].wasVisited=true;
				display(vertexList[v]);
				stack.push(v);
			}
		}
		for(int i=0;i<nVerts;i++){
			vertexList[i].wasVisited=false;
		}
		
	}
	
	public void display(Vertex ver){
		
	}
	
	public void bfs(){
		vertexList[0].wasVisited=true;
		display(vertexList[0]);
		queue.insert(0);
		int v2;
		while(!queue.isEmpty()){
			int v1 = queue.remove();
			while((v2=this.getAdjUnvisitedVertex(v1))!=-1){
				vertexList[v2].wasVisited=true;
				display(vertexList[v2]);
				queue.insert(vertexList[v2]);
			}
		}
		
	}

}
