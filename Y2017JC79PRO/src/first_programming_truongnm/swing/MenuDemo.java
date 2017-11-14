package first_programming_truongnm.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MenuDemo extends JFrame implements ActionListener {
	private JButton jbtAdd, jbtSub, jbtMul, jbtDiv, jbtClose;
	private JTextField jtfNum01, jtfNum02, jtfResult;
	private JMenuItem jmiAdd, jmiSub, jmiMul, jmiDiv, jmiClose;

	public MenuDemo() {
		this.setSize(805, 205);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar jmb = new JMenuBar();
		// Dua jmb vao Frame
		this.setJMenuBar(jmb);
		// Tao ra mot danh sach menu nam trong MenuBar
		JMenu operationMenu = new JMenu("Thao Tác");
		JMenu exitMenu = new JMenu("Đóng");
		// Đưa vào JMenuBar
		jmb.add(operationMenu);
		jmb.add(exitMenu);
		// Tạo ra menu con của "Thao Tác"
		jmiAdd = new JMenuItem("Cộng");
		jmiSub = new JMenuItem("Trừ");
		jmiMul = new JMenuItem("Nhân");
		jmiDiv = new JMenuItem("Chia");
		jmiClose = new JMenuItem("Đóng");
		operationMenu.add(jmiAdd);
		operationMenu.add(jmiSub);
		operationMenu.add(jmiMul);
		operationMenu.add(jmiDiv);
		exitMenu.add(jmiClose);

		// Tạo phím tắt cho các tác vụ trong Operation
		jmiAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		jmiSub.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		jmiMul.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		jmiDiv.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

		JPanel p1 = new JPanel(new FlowLayout());
		p1.add(new JLabel("Number 01"));
		p1.add(jtfNum01 = new JTextField(5));
		p1.add(new JLabel("Number 02"));
		p1.add(jtfNum02 = new JTextField(5));
		p1.add(new JLabel("Result"));
		p1.add(jtfResult = new JTextField(6));
		jtfResult.setEditable(false);

		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(jbtAdd = new JButton("Cộng"));
		p2.add(jbtSub = new JButton("Trừ"));
		p2.add(jbtMul = new JButton("Nhân"));
		p2.add(jbtDiv = new JButton("Chia"));

		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(p1, BorderLayout.CENTER);
		this.getContentPane().add(p2, BorderLayout.SOUTH);

		this.jbtAdd.addActionListener(this);
		this.jbtSub.addActionListener(this);
		this.jbtMul.addActionListener(this);
		this.jbtDiv.addActionListener(this);
		this.jmiClose.addActionListener(this);
	}

	public void tinhToan(char c) {
		int num01 = Integer.parseInt(jtfNum01.getText());
		int num02 = Integer.parseInt(jtfNum02.getText());
		int ketqua = 0;

		switch (c) {
		case '+':
			ketqua = num01 + num02;
			break;
		case '-':
			ketqua = num01 - num02;
			break;
		case '*':
			ketqua = num01 * num02;
			break;
		case '/':
			ketqua = num01 / num02;
			break;
		default:
			break;
		}
		jtfResult.setText(String.valueOf(ketqua));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == this.jbtAdd) {
				tinhToan('+');
			} else if (e.getSource() == this.jbtSub) {
				tinhToan('-');
			} else if (e.getSource() == this.jbtMul) {
				tinhToan('*');
			} else if (e.getSource() == this.jbtDiv) {
				tinhToan('/');
			} else if (e.getSource() == this.jmiClose) {
				int iObt = JOptionPane.showConfirmDialog(this.getParent(), "Do you wan to close this application?",
						"Close Window", JOptionPane.OK_CANCEL_OPTION);
				if (iObt == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}
}
