package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonDemo extends JFrame implements ActionListener {
	private JButton jbt;
	private JRadioButton rdb1, rdb2, rdb3;
	private ButtonGroup bg;
	private JLabel lb;

	public JRadioButtonDemo() {
		this.setTitle("Confirmation");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);

		lb = new JLabel("Kindly choose your gender: ");
		lb.setBounds(100, 50, 300, 50);
		this.add(lb);

		rdb1 = new JRadioButton("Male");
		rdb2 = new JRadioButton("Female");
		rdb3 = new JRadioButton("Other");

		rdb1.setBounds(150, 100, 100, 50);
		rdb2.setBounds(150, 150, 100, 50);
		rdb3.setBounds(150, 200, 100, 50);

		this.add(rdb1);
		this.add(rdb2);
		this.add(rdb3);

		bg = new ButtonGroup();
		bg.add(rdb1);
		bg.add(rdb2);
		bg.add(rdb3);

		jbt = new JButton("Choose");
		jbt.setBounds(150, 300, 100, 50);
		this.add(jbt);
		jbt.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			if (rdb1.isSelected()) {
				JOptionPane.showMessageDialog(null, "Male is saved", "GENDER", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else if (rdb2.isSelected()) {
				JOptionPane.showMessageDialog(null, "Female is saved", "GENDER", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else if (rdb3.isSelected()) {
				JOptionPane.showMessageDialog(null, "Other is saved", "GENDER", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else {
				int click = JOptionPane.showConfirmDialog(null, "Kindly choose one gender", "GENDER",
						JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
				if (click == JOptionPane.YES_OPTION) {
					return;
				} else {
					System.exit(0);
				}

			}
		}

	}

	public static void main(String[] args) {
		new JRadioButtonDemo();

	}

}
