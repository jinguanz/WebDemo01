package cmu.edu.jinguanz.crackingcode.threadslock;

public class MyObject {
	
	public synchronized void foo(String name){
		//System.out.println("Thread " + name +".foo():starting");
		try {
			System.out.println("Thread " + name +".foo():starting");
			Thread.sleep(3000);
			System.out.println("Thread " + name +".foo():ending");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread: " +name + ": interrupted");
		}
		
	}
	
	public static void main(String args[]){
		MyObject my1 = new MyObject();
		MyObject my2 = new MyObject();
		MyClass class1 = new MyClass("1",my1);
		MyClass class2 = new MyClass("2",my1);
		class1.start();
		class2.start();
	}

}
