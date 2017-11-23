package first_programming_truongnm.swing_series;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JLabelDemo extends JFrame {

	public JLabelDemo() {
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JLabel jLabel = new JLabel();
		jLabel.setText("Please kindly hove cursor here");
		jLabel.setToolTipText("This is Tool Tip");
		jLabel.setBackground(Color.CYAN);
		jLabel.setForeground(Color.BLUE);
		this.add(jLabel);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new JLabelDemo();

			}
		});
	}

}
