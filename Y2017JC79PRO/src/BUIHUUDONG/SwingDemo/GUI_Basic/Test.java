package BUIHUUDONG.SwingDemo.GUI_Basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class Test {

	public static void main(String[] args) {

		JFrame jframe = new JFrame("My Frame");

		jframe.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Test.class.getResource("/BUIHUUDONG/SwingDemo/icon/nhacungcap.png")));
		jframe.setSize(756, 500);
		jframe.setLocationRelativeTo(jframe);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setToolTipText("Day la demo");
		panel.setSize(new Dimension(4, 4));
		panel.setForeground(UIManager.getColor("MenuItem.disabledForeground"));
		panel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		panel.setBorder(new TitledBorder(
				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Three Component", TitledBorder.LEADING,
						TitledBorder.TOP, null, new Color(0, 0, 0)),
				"Three component", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(15, 16, 704, 140);
		jframe.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnClick = new JButton("Login");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnClick.setBounds(31, 44, 115, 29);
		panel.add(btnClick);

		JButton btnLogOut = new JButton("Logout");
		btnLogOut.setBounds(277, 44, 115, 29);
		panel.add(btnLogOut);

		jframe.setVisible(true);

	}
}
