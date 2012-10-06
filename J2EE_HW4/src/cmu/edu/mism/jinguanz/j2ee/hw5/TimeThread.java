package cmu.edu.mism.jinguanz.j2ee.hw5;

import javax.swing.JLabel;

public class TimeThread extends Thread{
	private JLabel label;
	private int time=25;
	
	public TimeThread(JLabel label){
		this.label=label;
		this.time=25;
	}
	
	public void run(){
		while(time>0){
			this.label.setText(Integer.toString(time));
			time--;
			try{
				this.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
	}

}
