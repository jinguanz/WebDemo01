package cmu.edu.jinguanz.amazon;

public class Queue {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	public Queue(int s){
		this.maxSize=s;
		queArray = new int[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	public void insert(int j){
		if(rear==maxSize-1) //deal with wrap around
		     rear=-1;
		queArray[++rear]=j;
		nItems++;
	}
	
	public int remove(){
		int temp = queArray[front++];
		if(front==maxSize) // deal with wrap around
			front=0;
		nItems--;
		return temp;
		
		
	}
	
	public int peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public boolean isFull(){
		return (nItems==maxSize);
	}
	

}
