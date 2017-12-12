package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JPasswordField extends JFrame implements ActionListener {
	private JButton jbt;
	private JTextField jtf;
	private javax.swing.JPasswordField jpf;

	public JPasswordField() {
		this.setLayout(null);
		jpf = new javax.swing.JPasswordField();
		jpf.setBounds(50, 100, 190, 30);
		jpf.setEchoChar('*');

		jbt = new JButton("Get password");
		jbt.addActionListener(this);
		pack();
		this.add(jbt);
		this.add(jpf);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JPasswordField();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
