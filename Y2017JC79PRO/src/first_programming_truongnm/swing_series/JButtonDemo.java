package first_programming_truongnm.swing_series;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JButtonDemo extends JFrame implements ActionListener {
	private JButton jbt1, jbt2;
	private JLabel jLabel;

	public JButtonDemo() {
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
		if (e.getSource() == this.jbt1) {
			this.jLabel.setText("Hello ugly boy");
			this.jLabel.setForeground(Color.RED);
		}

	}

	public static void main(String[] args) {
		// new JButtonDemo();
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
				new JButtonDemo();

			}
		});

	}

}
