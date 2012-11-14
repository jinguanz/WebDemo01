package cmu.edu.jinguanz.crackingcode.threadslock;

public class MyThread implements Runnable {
	private SyncDemo demo;
	
	public MyThread(SyncDemo demo){
		this.demo=demo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		demo.sellTicket();
		
	}

}
