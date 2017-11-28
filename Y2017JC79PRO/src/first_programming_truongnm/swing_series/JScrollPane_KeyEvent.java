package first_programming_truongnm.swing_series;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JScrollPane_KeyEvent extends JFrame implements KeyListener {
	private JLabel jlb;
	private JTextField jtf;
	private JTextArea jta;

	public JScrollPane_KeyEvent() {
		setTitle("Key Event");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		jlb = new JLabel("Use keyboard on textfield and receive results in textarea:");
		jlb.setBounds(20, 10, 400, 50);
		add(jlb);

		jtf = new JTextField();
		jtf.setBounds(100, 70, 300, 50);
		add(jtf);
		jtf.addKeyListener(this);

		jta = new JTextArea();
		JScrollPane jscr = new JScrollPane(jta);

		// always display scrollbar
		jscr.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jscr.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jscr.setBounds(100, 130, 300, 320);
		add(jscr);

		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		jta.append("Key " + e.getKeyChar() + " pressed\n");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		jta.append("Key " + e.getKeyChar() + " released\n");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		jta.append("Key " + e.getKeyChar() + " typed\n");
	}

	public static void main(String[] args) {
		new JScrollPane_KeyEvent();

	}
}
