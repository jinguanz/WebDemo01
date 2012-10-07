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
	private JLabel lblScore;
	public static int score = 0;
	private List<JButton> buttonList;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private JButton button_18;
	private JButton button_19;

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
		JButton btnNewButton = new JButton("Start\n\n");
		frmWhackamole = new JFrame();
		frmWhackamole.setTitle("Whack-a-Mole\n\n");
		frmWhackamole.setBounds(100, 100, 611, 392);
		frmWhackamole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWhackamole.getContentPane().setLayout(null);
		frmWhackamole.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(202, 5, 81, 29);
		frmWhackamole.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblTimeLeft = new JLabel("Time Left:");
		lblTimeLeft.setBounds(116, 11, 74, 16);
		frmWhackamole.getContentPane().add(lblTimeLeft);

		lblScore = new JLabel("Score:");
		lblScore.setBounds(318, 8, 75, 23);
		frmWhackamole.getContentPane().add(lblScore);

		textField_1 = new JTextField();
		textField_1.setBounds(405, 5, 134, 28);
		frmWhackamole.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		button = new JButton("");
		button.setBounds(23, 66, 81, 44);
		frmWhackamole.getContentPane().add(button);
		buttonList.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button.setText("");
				button.setEnabled(false);
				button.setOpaque(false);
			}
		});

		button_1 = new JButton("");
		button_1.setBounds(140, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_1);
		buttonList.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_1.setText("");
				button_1.setEnabled(false);
				button_1.setOpaque(false);
			}
		});

		button_2 = new JButton("");
		button_2.setBounds(255, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_2);
		buttonList.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_2.setText("");
				button_2.setEnabled(false);
				button_2.setOpaque(false);
			}
		});

		button_3 = new JButton("");
		button_3.setBounds(370, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_3);
		buttonList.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_3.setText("");
				button_3.setEnabled(false);
				button_3.setOpaque(false);
			}
		});

		button_4 = new JButton("\n");
		button_4.setBounds(493, 66, 81, 44);
		frmWhackamole.getContentPane().add(button_4);
		buttonList.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_4.setText("");
				button_4.setEnabled(false);
				button_4.setOpaque(false);
			}
		});

		button_5 = new JButton("");
		button_5.setBounds(23, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_5);
		buttonList.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_5.setText("");
				button_5.setEnabled(false);
				button_5.setOpaque(false);
			}
		});

		button_6 = new JButton("");
		button_6.setBounds(140, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_6);
		buttonList.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_6.setText("");
				button_6.setEnabled(false);
				button_6.setOpaque(false);
			}
		});

		button_7 = new JButton("");
		button_7.setBounds(255, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_7);
		buttonList.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_7.setText("");
				button_7.setEnabled(false);
				button_7.setOpaque(false);
			}
		});

		button_8 = new JButton("");
		button_8.setBounds(370, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_8);
		buttonList.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_8.setText("");
				button_8.setEnabled(false);
				button_8.setOpaque(false);
			}
		});

		button_9 = new JButton("");
		button_9.setBounds(493, 132, 81, 44);
		frmWhackamole.getContentPane().add(button_9);
		buttonList.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_9.setText("");
				button_9.setEnabled(false);
				button_9.setOpaque(false);
			}
		});

		button_10 = new JButton("");
		button_10.setBounds(23, 191, 81, 44);
		frmWhackamole.getContentPane().add(button_10);
		buttonList.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_10.setText("");
				button_10.setEnabled(false);
				button_10.setOpaque(false);
			}
		});

		button_11 = new JButton("");
		button_11.setBounds(140, 188, 81, 44);
		frmWhackamole.getContentPane().add(button_11);
		buttonList.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_11.setText("");
				button_11.setEnabled(false);
				button_11.setOpaque(false);
			}
		});

		button_12 = new JButton("");
		button_12.setBounds(255, 188, 81, 44);
		frmWhackamole.getContentPane().add(button_12);
		buttonList.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_12.setText("");
				button_12.setEnabled(false);
				button_12.setOpaque(false);
			}
		});

		button_13 = new JButton("");
		button_13.setBounds(370, 188, 81, 44);
		frmWhackamole.getContentPane().add(button_13);
		buttonList.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_13.setText("");
				button_13.setEnabled(false);
				button_13.setOpaque(false);
			}
		});

		button_14 = new JButton("");
		button_14.setBounds(493, 191, 81, 44);
		frmWhackamole.getContentPane().add(button_14);
		buttonList.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_14.setText("");
				button_14.setEnabled(false);
				button_14.setOpaque(false);
			}
		});

		button_15 = new JButton("");
		button_15.setBounds(23, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_15);
		buttonList.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_15.setText("");
				button_15.setEnabled(false);
				button_15.setOpaque(false);
			}
		});

		button_16 = new JButton("");
		button_16.setBounds(140, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_16);
		buttonList.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_16.setText("");
				button_16.setEnabled(false);
				button_16.setOpaque(false);
			}
		});

		button_17 = new JButton("");
		button_17.setBounds(255, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_17);
		buttonList.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_17.setText("");
				button_17.setEnabled(false);
				button_17.setOpaque(false);

			}
		});

		button_18 = new JButton("");
		button_18.setBounds(370, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_18);
		buttonList.add(button_18);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_18.setText("");
				button_18.setEnabled(false);
				button_18.setOpaque(false);
			}
		});

		button_19 = new JButton("");
		button_19.setBounds(493, 259, 81, 44);
		frmWhackamole.getContentPane().add(button_19);
		buttonList.add(button_19);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 5;
				textField_1.setText(Integer.toString(score));
				button_19.setText("");
				button_19.setEnabled(false);
				button_19.setOpaque(false);
			}
		});

		
		btnNewButton.setBounds(23, 6, 81, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    score=0;
				Thread t1 = new TimeThread(textField);
				t1.start();

				Thread t2 = new ColorThread(buttonList);
				t2.start();
			}
		});

	}
}
