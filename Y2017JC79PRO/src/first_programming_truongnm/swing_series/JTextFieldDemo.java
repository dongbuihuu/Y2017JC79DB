package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JTextFieldDemo extends JFrame implements ActionListener {
	private JButton jb;
	private JTextField jtf;

	public JTextFieldDemo() {
		this.setTitle("JTexField Demo");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jtf = new JTextField();
		jtf.setBounds(100, 50, 300, 50);
		this.add(jtf, "North", 0);

		jb = new JButton("Click here");
		jb.setBounds(150, 300, 100, 50);
		this.add(jb, "Center", 1);
		jb.addActionListener(this);

		this.getContentPane().setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb) {
			jtf.setText("Truong is handsome boy");

			int click = JOptionPane.showConfirmDialog(null, "Does Truong is handsome boy?", "Question",
					JOptionPane.YES_NO_OPTION);
			if (click == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Truong is handsome boy!", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (click == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "You are ugly boy!", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "You closed the window", "Confirmation",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

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
				new JTextFieldDemo();

			}
		});

	}

}
