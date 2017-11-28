package first_programming_truongnm.swing_series;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JScrollPane_MouseEventDemo extends JFrame implements MouseListener {
	private JTextField jtf;
	private JTextArea jta;
	private JLabel lb;

	public JScrollPane_MouseEventDemo() {
		this.setTitle("Mouse Event");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		lb = new JLabel("Try actions on mouse on textfield and receive results in textarea: ");
		lb.setBounds(20, 10, 400, 50);
		this.add(lb);

		jtf = new JTextField();
		this.add(jtf);
		jtf.setBounds(100, 70, 300, 50);
		jtf.addMouseListener(this);

		jta = new JTextArea();
		// jta.setLineWrap(true);
		jta.setWrapStyleWord(true);

		JScrollPane jscpane = new JScrollPane(jta);
		// always display scrollbar
		jscpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jscpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jscpane.setBounds(100, 130, 300, 320); // Set bounds to TextArea by JSrollPane because JScrollPane is parent
		this.add(jscpane);
		this.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		jta.append("Mouse is clicked \n");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		jta.append("Mouse is entered into Text Field \n");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		jta.append("Mouse is pressed on " + "(" + e.getX() + "," + e.getY() + ")\n");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		jta.append("Mouse is released \n");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		jta.append("Mouse is run outside Text Field \n");

	}

	public static void main(String[] args) {
		new JScrollPane_MouseEventDemo();

	}
}
