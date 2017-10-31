package BUIHUUDONG.SwingDemo.GUI_Basic.LoanCalculation;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class LoanCal extends JFrame {

	private JPanel contentPane;
	private JTextField txt2;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanCal frame = new LoanCal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoanCal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		TitledBorder abc = new TitledBorder(panel.getBorder());
		abc.setTitleFont(new Font("Arial", Font.BOLD, 25));
		abc.setTitle("Bui Huu Dong");
		panel.setBorder(abc);

		// panel.setBorder(new TitledBorder(null, "Tieu de", TitledBorder.LEADING,
		// TitledBorder.TOP, null, null));

		panel.setBounds(15, 16, 682, 170);
		contentPane.add(panel);

		txt1 = new JTextField();
		txt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					txt2.requestFocus();
				}
			}
		});
		panel.add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();

		txt2.setColumns(10);
		JButton btnLogin = new JButton("Login");
		btnLogin.setActionCommand("");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panel.repaint();
			}
		});
		btnLogin.setBounds(277, 228, 163, 21);
		txt2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					btnLogin.requestFocus();
				}

			}
		});
		panel.add(txt2);

		contentPane.add(btnLogin);
	}
}
