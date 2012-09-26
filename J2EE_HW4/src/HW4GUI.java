import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

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
	private Date date;
	private String desc;
	private double amount;
	private double fee;
	public static final String DATE_ERROR="Date is not a valid date";
	public static final String DESC_ERROR="Description cannot be empty";
	public static final String DEPOSITE_ERROR="Deposite amount is not a valid number";
	public static final String CHECK_ERROR="Check amount is not a valid number";
	private List<HW4Data> dataList;
	private MyComparator comparator;
	public HW4GUI() {
		dataList = new ArrayList<HW4Data>();
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
		area.setText("Date\tCheck #\tDescription\t\tAmount\tFee\tBalance" +"\n");
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
		comparator = new MyComparator();
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
			HW4Data data = createNewData("check");
			//add a valid condition
			balance=balance + data.getAmount()-data.getFee();
			dataList.add(data);
			Collections.sort(dataList,comparator);
			for(HW4Data hw4Data: dataList){
				balance = balance + hw4Data.getBalance();
				area.append( hw4Data.getDate() +"\t\t" +hw4Data.getDesc() +"\t\t"+ hw4Data.getAmount() +"\t" + hw4Data.getFee() +"\t" + balance + "\t" + "\n");
				
			}
			
			
		}
	    if(e.getSource()==depositeButton){
			HW4Data data = createNewData("deposite");
			//add a valid condition
			balance=balance + data.getAmount()-data.getFee();
			dataList.add(data);
			Collections.sort(dataList,comparator);
			for(HW4Data hw4Data: dataList){
				balance = balance + hw4Data.getBalance();
				area.append( hw4Data.getDate() +"\t" + checkNumber +"\t" +hw4Data.getDesc() +"\t\t"+ hw4Data.getAmount() +"\t" + hw4Data.getFee() +"\t" + balance + "\t" + "\n");
			}
			checkNumber++;
			
		}
			
		
		
	}
	
	public boolean isInvalid(){
		return true;
	}
	
	public HW4Data createNewData(String type){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		try {
			date = df.parse(dateField.getText().trim());
			System.out.println("date: " + date);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		desc=descriptionField.getText();
		amount=Double.parseDouble(amoutnField.getText());
		if(type.equals("check"))
			fee=checkFee(amount);
		else
			fee=depositeFee(amount);
		HW4Data data = new HW4Data(df.format(date), desc, amount, fee);
		return data;
	}
	/**
	 * Calculate check fee
	 * @param checkAmount
	 * @return
	 */
	
	public static double checkFee(double checkAmount){
		if(checkAmount<10)
			return 0.10;
		else if(checkAmount<100 || checkAmount >10 || checkAmount ==10)
			return 0.01 * checkAmount;
		else 
			return 1.00;
	}
	
	public static double depositeFee(double depositeAmount){
		if(depositeAmount >=1 && depositeAmount <=100)
			return 0.05;
		else if(depositeAmount >100 && depositeAmount <=1000)
			return 0.005 * depositeAmount;
		else
			return 0.0025*depositeAmount;
		
	}
	
	public static boolean isValid(HW4Data hw4Data){
		
		return false;
	}
	
	
		
	class MyComparator implements Comparator<Object>{

		@Override
		public int compare(Object o1, Object o2) {
			HW4Data data01= (HW4Data) o1;
			HW4Data data02 = (HW4Data) o2;
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date date01 = null, date02 = null;
			try {
				date01 = (Date)df.parse(data01.getDate());
				date02= (Date)df.parse(data02.getDate());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(date01.before(date02))
		          return 1;
		       else if(date01.before(date02))
		          return -1;
		       else
		          return 0;
			
		}

		
	    
	   

	    
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HW4GUI();
	}
	
	

}
