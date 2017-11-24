package first_programming_truongnm.swing_series;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JOptionPaneShowConfirmDialogDemo extends JFrame implements ActionListener {
	private JButton jbt1;
	private JLabel jLabel;

	public JOptionPaneShowConfirmDialogDemo() {

		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		jLabel = new JLabel();
		jLabel.setBounds(200, 350, 250, 50);
		jLabel.setText("Hello handsome boy");
		jLabel.setToolTipText("That's false");

		jbt1 = new JButton("Click here");
		jbt1.setBounds(200, 200, 100, 50);
		jbt1.addActionListener(this);
		this.getContentPane().setLayout(null);
		this.add(jLabel);
		this.add(jbt1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jLabel.setText("You are ugly boy");
		jLabel.setForeground(Color.red);

		int click = JOptionPane.showConfirmDialog(null, "Are you sure you're handsome?", "Question",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (click == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "You are handsome boy");
		} else if (click == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "You are ugly boy");
		} else {
			JOptionPane.showMessageDialog(null, "You are gay");
		}
	}

	public static void main(String[] args) {
		new JOptionPaneShowConfirmDialogDemo();
	}

}
