package first_programming_truongnm.swing_series;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarDemo extends JFrame {
	private JProgressBar jpb;
	private int i;

	public JProgressBarDemo() {
		this.setLayout(null);
		jpb = new JProgressBar(0, 100);
		jpb.setBounds(20, 70, 140, 20);
		jpb.setStringPainted(true);
		jpb.setValue(0);

		this.add(jpb);
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// operate();
		// }
		//
		// public void operate() {

		while (i <= jpb.getMaximum()) {
			jpb.setValue(i);
			i = i + 5;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		// Note: Look and feels do not support method "setStringPainted"
		// We can not use look and feels in this situation

		new JProgressBarDemo();

	}

}
