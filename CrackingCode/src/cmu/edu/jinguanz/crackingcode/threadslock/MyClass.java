package cmu.edu.jinguanz.crackingcode.threadslock;

public class MyClass extends Thread{
	private String name;
	private MyObject myObj;
	
	public MyClass(String name, MyObject obj){
		this.name=name;
		myObj=obj;
	}
	
	public void run(){
		myObj.foo(name);
	}
	

}
