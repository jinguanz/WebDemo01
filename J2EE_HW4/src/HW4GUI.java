import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class HW4GUI {

	/**
	 * @param args
	 */
	public HW4GUI() {
		JFrame frame = new JFrame("15-600 Checking Account Register");
		frame.setSize(520, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pane = new JPanel();

		Font bigFont = new Font(Font.SERIF, Font.BOLD, 20);

		JLabel label = new JLabel("Date");
		JLabel desLabel = new JLabel("Description");
		JLabel accLabel = new JLabel("Account");
		
		label.setFont(bigFont);
		pane.add(label);
		pane.add(desLabel);
		pane.add(accLabel);

		JPanel line = new JPanel();

		JButton button = new JButton();
		line.add(button);

		JButton button2 = new JButton();
		line.add(button2);

		pane.add(line, BorderLayout.LINE_START);

		JTextArea area = new JTextArea(10, 40);
		area.setText("Yes, we can.");
		pane.add(area);

		frame.setContentPane(pane);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HW4GUI();

	}

}
