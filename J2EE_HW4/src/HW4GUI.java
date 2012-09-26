import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Name:Jinguang Zhou
 * AndrewID: jinguanz
 * Class:08-600;
 * Date:2012-09-25
 *
 */
public class HW4GUI extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	static double balance=0.00;
	static int checkNumber = 101;
	private JButton checkButton;
	private JButton depositeButton;
	private JTextField dateField;
	private JTextField descriptionField;
	private JTextField amoutnField;
	private JTextField errorField;
	private JTextArea area;
	public HW4GUI() {
		JFrame frame = new JFrame("15-600 Checking Account Register");
		frame.setSize(520, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		JLabel label = new JLabel("Date");
		JLabel desLabel = new JLabel("Description");
		JLabel accLabel = new JLabel("Account");
		pane.add(label);
		pane.add(desLabel);
		pane.add(accLabel);
		JPanel pane01= new JPanel();
		dateField = new JTextField(10);
		dateField.setText(getDate());
		descriptionField = new JTextField(15);
		amoutnField = new JTextField(5);
		JLabel moneyLabel = new JLabel("$");
		pane01.add(dateField);
		pane01.add(descriptionField);
		pane01.add(moneyLabel);
		pane01.add(amoutnField);
		JPanel buttonPane = new JPanel();
		checkButton = new JButton("Write Check");
		checkButton.addActionListener(this);
		depositeButton = new JButton("Make Deposite");
		depositeButton.addActionListener(this);
		buttonPane.add(checkButton);
		buttonPane.add(depositeButton);
		JPanel errorPanel = new JPanel();
		errorField = new JTextField(45);
		errorField.setEditable(false);
		errorPanel.add(errorField);
		area = new JTextArea(15, 45);
		area.setText("Date\tCheck #\tDescription\tAmount\tFee\tBalance" +"\n");
		area.setEditable(false);
		JScrollPane scroller = new JScrollPane(area);
		pane.add(scroller);
		pane.add(pane01);
        pane.add(buttonPane);
        pane.add(errorPanel);
        pane.add(scroller);
        frame.add(pane);
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
	
	
	public static String getDate(){
		   DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		   //get current date time with Date()
		   Date date = new Date();
		   String currentDate=dateFormat.format(date);
		   return currentDate;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==checkButton){
			String dataContent = dateField.getText()  ;
			errorField.setText(dataContent);
			area.append("a\tb\tc\td\t " + "\n");
		}
	    if(e.getSource()==depositeButton){
			String date = dateField.getText();
			String desc = descriptionField.getText();
			String amount = amoutnField.getText();
			area.append(date +"\t" + checkNumber +"\t" + desc +"\t" + amount +"\t" + "\n");
			checkNumber++;
			
		}
			
		
		
	}
	
	public boolean isInvalid(){
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HW4GUI();
	}
	
	

}
