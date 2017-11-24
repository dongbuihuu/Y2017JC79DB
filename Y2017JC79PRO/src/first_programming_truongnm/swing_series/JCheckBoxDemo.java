package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JCheckBoxDemo extends JFrame implements ActionListener, ItemListener {
	private JButton jbt;
	private JCheckBox cb1, cb2, cb3, cball;
	private JLabel lb;
	// private JPanel pn;

	public JCheckBoxDemo() {
		this.setTitle("Survey");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);

		lb = new JLabel("How do you wanna be? ");
		lb.setBounds(100, 50, 300, 50);
		this.add(lb);

		cb1 = new JCheckBox("Billionair");
		cb2 = new JCheckBox("Millionair");
		cb3 = new JCheckBox("Good guy");
		cball = new JCheckBox("Select All");

		cb1.setBounds(150, 100, 100, 50);
		cb2.setBounds(150, 150, 100, 50);
		cb3.setBounds(150, 200, 100, 50);
		cball.setBounds(150, 250, 100, 50);
		cball.addItemListener(this);

		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.add(cball);

		// pn = new JPanel();
		// pn.add(cb1);
		// pn.add(cb2);
		// pn.add(cb3);
		// this.add(pn);

		jbt = new JButton("Save");
		jbt.setBounds(150, 350, 100, 50);
		this.add(jbt);
		jbt.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			if (!cb1.isSelected() && !cb2.isSelected() && !cb3.isSelected()) {
				int click = JOptionPane.showConfirmDialog(null, "Kindly choose one", "WARNING", JOptionPane.YES_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (click == JOptionPane.YES_OPTION) {
					return;
				} else {
					System.exit(0);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Saved", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			cb1.setSelected(true);
			cb2.setSelected(true);
			cb3.setSelected(true);
		} else {
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
		}

	}

	public static void main(String[] args) {
		new JCheckBoxDemo();

	}

}
