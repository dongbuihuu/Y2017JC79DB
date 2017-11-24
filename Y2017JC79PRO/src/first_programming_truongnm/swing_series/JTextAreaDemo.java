package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaDemo extends JFrame implements ActionListener {
	private JButton jbt1, jbt2;
	private JTextArea jta;
	private String description = "";

	public JTextAreaDemo() {
		this.setTitle("Fill in this text");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);

		jbt1 = new JButton("Undo");
		jbt2 = new JButton("Clear");

		jbt1.setBounds(250, 400, 70, 50);
		jbt2.setBounds(350, 400, 70, 50);
		this.add(jbt1);
		this.add(jbt2);

		jta = new JTextArea();
		jta.setBounds(25, 25, 450, 350);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		this.add(jta);
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt2) {
			if (!jta.getText().equals("")) {
				description = jta.getText();
			}
			jta.setText(null);

		}
		if (e.getSource() == jbt1) {
			jta.setText(description);
		}

	}

	public static void main(String[] args) {
		new JTextAreaDemo();

	}

}
