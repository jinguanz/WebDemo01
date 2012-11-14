package cmu.edu.mism.jinguanz.j2ee.midterm;

/**
 * Andrew ID:jinguanz
 * Name: Jinguang Zhou
 */


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Midterm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;
	private List<Contribute> obamaList = new ArrayList<Contribute>();
	private List<Contribute> romneyList = new ArrayList<Contribute>();
	public static final String AMOUNT_LARGE_ERROR="***Contribution is too large ($ 10,000,000 is the maximum allowed)";
	public static final String AMOUNT_NEGATIVE_ERROR="Amount cannot be a negative number";
	public static final String NAME_ERROR="Name cannot be empty";
	public static final String AMOUNT_NUMBER_ERROR="Amount must be integer";
	private MyComparator comparator = new MyComparator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Midterm window = new Midterm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Midterm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Midterm Champaign Contribution Application");
		frame.setBounds(100, 100, 748, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contributor Last Name");
		lblNewLabel.setBounds(20, 24, 144, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(177, 18, 92, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(281, 24, 79, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(372, 18, 107, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setBounds(491, 24, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(564, 18, 134, 28);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Contribute to Obama");
		btnNewButton.setBounds(100, 52, 229, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isCheckAmountValid(textField_2.getText()) && isNameValid(textField.getText(),textField_1.getText())){
					Contribute contribute = new Contribute(textField.getText().trim(), textField_1.getText().trim(), textField_2.getText());
					textArea.append(contribute.getLastName() +", " + contribute.getFirstName() + "\t\t\t"+"$" + getStandardBalance(Integer.parseInt(contribute.getAmount())) +"\t\t"+"  Obama" +"\n");
					obamaList.add(contribute);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				}
				
				
				
			}
		});

		
		JButton btnNewButton_1 = new JButton("Contribute to Romney");
		btnNewButton_1.setBounds(438, 58, 201, 29);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isCheckAmountValid(textField_2.getText()) && isNameValid(textField.getText(),textField_1.getText())){
					Contribute contribute = new Contribute(textField.getText().trim(), textField_1.getText().trim(), textField_2.getText());
					textArea.append(contribute.getLastName() +", " + contribute.getFirstName() + "\t\t\t" +"$" + getStandardBalance(Integer.parseInt(contribute.getAmount())) + "\t\t" +"  Romney" +"\n");
					romneyList.add(contribute);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				}
				
				
			}
		});

		
		JButton btnNewButton_2 = new JButton("List Obama Contributors");
		btnNewButton_2.setBounds(100, 93, 229, 29);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Collections.sort(obamaList, comparator);
				int total=0;
				textArea.setText("");
				for(Contribute contribute:obamaList){
					textArea.append(contribute.getLastName() +", " + contribute.getFirstName()+ "\t\t\t" +"$" + getStandardBalance(Integer.parseInt(contribute.getAmount())) + "\t\t" +"  Obama" +"\n");
					total=total + Integer.parseInt(contribute.getAmount());
				}
				textArea.append("Total contribution for Obama: $ " + getStandardBalance(total) +"\n");
				
				
				
			}
		});

		
		JButton btnNewButton_3 = new JButton("List Romney Contributors");
		btnNewButton_3.setBounds(438, 93, 201, 29);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Collections.sort(romneyList, comparator);
				int total=0;
				textArea.setText("");
				for(Contribute contribute:romneyList){
					textArea.append(contribute.getLastName() +", " + contribute.getFirstName()+ "\t\t\t" +"$" + getStandardBalance(Integer.parseInt(contribute.getAmount())) + "\t\t" +"  Romney" +"\n");
					total=total + Integer.parseInt(contribute.getAmount());
				}
				textArea.append("Total contribution for Romney: $ " + getStandardBalance(total) +"\n");
				
        
			}
		});

		
		textArea = new JTextArea();
		textArea.setBounds(55, 150, 643, 206);
		frame.getContentPane().add(textArea);
	}
	
	/**
	 * Check whether the amount is valid
	 * @param amount
	 * @return
	 */
	
	public boolean isCheckAmountValid(String amount) {
		boolean flag = false;
		int realAmount = 0;
		try {
			realAmount = Integer.parseInt(amount);
			flag = true;
		} catch (NumberFormatException e) {
			textArea.append(AMOUNT_NUMBER_ERROR + "\n");
			return false;
		}
		if (realAmount < 0) {
			textArea.append(AMOUNT_NEGATIVE_ERROR + "\n");
			return false;
		} else if(realAmount>10000000){
			textArea.append(AMOUNT_LARGE_ERROR + "\n");
			return false;
			
		}
			return flag;
		
		
	}
	/**
	 * Implement a comparator
	 * @author jinguangzhou
	 *
	 */
	
	class MyComparator implements Comparator<Object> {

		@Override
		public int compare(Object o1, Object o2) {
			Contribute con01 = (Contribute) o1;
			Contribute con02 = (Contribute) o2;
			int amount01=Integer.parseInt(con01.getAmount());
			int amount02=Integer.parseInt(con02.getAmount());
			if(amount01>amount02){
				return -1;
			}else if(amount01==amount02){
				int result=con01.getLastName().compareTo(con02.getLastName());
				if(result>0)
					return 1;
				else if(result<0)
					return -1;
				else{
					int firstNameResult=con01.getFirstName().compareTo(con02.getFirstName());
					if(firstNameResult>0)
						return 1;
					else if(firstNameResult<0)
						return -1;
					else
						return 0;
				}
				
			}else if(amount01<amount02){
				return 1;
			}else 
				return 0;

		}

	}
	/**
	 * Check whether the name is valid
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	
	public boolean isNameValid(String firstName, String lastName){
		if(lastName.equals("") || firstName.equals("")){
			textArea.append(NAME_ERROR + "\n");
			return false;
		}else;
		return true;
		
	}
	/**
	 * Get the standard balance
	 * @param balance
	 * @return
	 */
	
	public String getStandardBalance(int balance) {
		DecimalFormat df = new DecimalFormat("#,###,### ");
		return df.format(balance);
	}
	
	
}
	
	

