package cmu.edu.mism.jinguanz.j2ee.hw5;

import javax.swing.JTextField;

public class TimeThread extends Thread{
	private JTextField textField;
	public static int time=25;
	
	public TimeThread(JTextField textField){
		this.textField=textField;
		this.time=25;
	}
	
	public void run(){
		while(time>=0){
			this.textField.setText(Integer.toString(time));
			time--;
			
			try{
				this.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
	}

}
