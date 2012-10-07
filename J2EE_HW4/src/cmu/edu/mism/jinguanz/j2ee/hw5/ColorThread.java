package cmu.edu.mism.jinguanz.j2ee.hw5;

import java.awt.Color;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;

/**
 * Name:Jinguang Zhou
 * AndrewID:jinguanz
 * Course:08-600
 * Date:10/05/2012
 * @author jinguangzhou
 * Use this class to control color thread
 */

public class ColorThread extends Thread{
	private List<JButton> arrayButton; //Use this list to save all buttons
	
	public ColorThread(List<JButton> arrayButton){
		this.arrayButton=arrayButton;
	}
	
	
	
	
	public void run(){
		while (TimeThread.time>0) {
			int number=getRandomButton();
			setColorButton(number);
			try {
				this.sleep(1000);
				arrayButton.get(number).setText("");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
		}
	
		
	}
	/**
	 * Use this method to randomly generate a button which is red. 
	 * @return
	 */
	
	public int getRandomButton(){
		Random random = new Random();
		int number = random.nextInt(20);
		return number;
	}
	/**
	 * Use this method to set the red button and disable other buttons. 
	 * @param number
	 */
	public void setColorButton(int number){
		arrayButton.get(number).setEnabled(true);
		arrayButton.get(number).setText(": - )");
		arrayButton.get(number).setBackground(Color.RED);
		arrayButton.get(number).setOpaque(true);
		for(int i=0;i<arrayButton.size();i++){
			if(i!=number){
				arrayButton.get(i).setEnabled(false);
				arrayButton.get(i).setOpaque(false);
			}
		}
		
	}
	
	

}
