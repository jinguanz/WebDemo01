package cmu.edu.jinguanz.crackingcode.threadslock;

public class SyncDemo {
	private int ticket=5;
	public synchronized void sellTicket(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("sell : ticket" + ticket--);
			}
		}
		
	}
	
	public static void main(String args[]){
		SyncDemo demo = new SyncDemo();
		//SyncDemo demo01 = new SyncDemo();
		MyThread thread = new MyThread(demo);
		//MyThread thread01 = new MyThread(demo01);
		Thread t1= new Thread(thread);
		//Thread t2 = new Thread(thread01);
		Thread t3 = new Thread(thread);
		t1.start();
		//t2.start();
		t3.start();
		
	}

}
