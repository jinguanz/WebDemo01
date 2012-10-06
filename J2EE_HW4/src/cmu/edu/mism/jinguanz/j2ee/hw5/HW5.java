package cmu.edu.mism.jinguanz.j2ee.hw5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class HW5 {

	private JFrame frmWhackamole;
	private JTextField textField;
	private JTextField textField_1;
	public static int score=0;
	private List<JButton> buttonList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HW5 window = new HW5();
					window.frmWhackamole.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HW5() {
		buttonList = new ArrayList<JButton>();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWhackamole = new JFrame();
		frmWhackamole.setTitle("Whack-a-Mole\n\n");
		frmWhackamole.setBounds(100, 100, 611, 392);
		frmWhackamole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Start\n\n");
		btnNewButton.setBounds(23, 6, 81, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		frmWhackamole.getContentPane().setLayout(null);
		frmWhackamole.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(202, 5, 81, 29);
		frmWhackamole.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTimeLeft = new JLabel("Time Left:");
		lblTimeLeft.setBounds(116, 11, 74, 16);
		frmWhackamole.getContentPane().add(lblTimeLeft);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(318, 8, 75, 23);
		frmWhackamole.getContentPane().add(lblScore);
		
		textField_1 = new JTextField();
		textField_1.setBounds(405, 5, 134, 28);
		frmWhackamole.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("");
		button.setBounds(23, 66, 81, 44);
		frmWhackamole.getContentPane().add(button);
		buttonList.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_1 = new JButton("");
		button_1.setBounds(140, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_1);
		buttonList.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_2 = new JButton("");
		button_2.setBounds(255, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_2);
		buttonList.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_3 = new JButton("");
		button_3.setBounds(370, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_3);
		buttonList.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_4 = new JButton("\n");
		button_4.setBounds(493, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_4);
		buttonList.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_5 = new JButton("");
		button_5.setBounds(23, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_5);
		buttonList.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_6 = new JButton("");
		button_6.setBounds(140, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_6);
		buttonList.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_7 = new JButton("");
		button_7.setBounds(255, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_7);
		buttonList.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_8 = new JButton("");
		button_8.setBounds(370, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_8);
		buttonList.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_9 = new JButton("");
		button_9.setBounds(493, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_9);
		buttonList.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_10 = new JButton("");
		button_10.setBounds(23, 191, 81, 44);
		frmWhackamole.getContentPane().add(button_10);
		buttonList.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_11 = new JButton("");
		button_11.setBounds(140, 188, 81, 44);
		frmWhackamole.getContentPane().add(button_11);
		buttonList.add(button_11);
	    button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_12 = new JButton("");
		button_12.setBounds(255, 188, 81, 44);
		frmWhackamole.getContentPane().add(button_12);
		buttonList.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_13 = new JButton("");
		button_13.setBounds(370, 188, 81, 44);
		frmWhackamole.getContentPane().add(button_13);
		buttonList.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_14 = new JButton("");
		button_14.setBounds(493, 191, 81, 44);
		frmWhackamole.getContentPane().add(button_14);
		buttonList.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_15 = new JButton("");
		button_15.setBounds(23, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_15);
		buttonList.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_16 = new JButton("");
		button_16.setBounds(140, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_16);
		buttonList.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_17 = new JButton("");
		button_17.setBounds(255, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_17);
		buttonList.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_18 = new JButton("");
		button_18.setBounds(370, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_18);
		buttonList.add(button_18);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
		
		JButton button_19 = new JButton("");
		button_19.setBounds(493, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_19);
		buttonList.add(button_19);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action for each button
			}
		});
	}
}
