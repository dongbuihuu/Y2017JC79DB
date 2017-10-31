package first_programming_truongnm.swing_java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FramTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Dialog");
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton("Hello World");
		panel.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

}
