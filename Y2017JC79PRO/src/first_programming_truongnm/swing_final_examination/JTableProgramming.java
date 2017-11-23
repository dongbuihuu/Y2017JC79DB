package first_programming_truongnm.swing_final_examination;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableProgramming extends JFrame {
	private JButton jbAdd, jbEdit, jbDelete, jbClose;

	public JTableProgramming() {

		String[][] data = {
				{ "Bui Huu Dong", "Huynh Tan Phat Street, D7, HCMC", "Y2017JC79", "012312455", "0903823646" },
				{ "Ton Minh Son", "Nam Long Street, D1, HCMC", "Y2017JC79", "0123143455", "0902933185" } };
		String column[] = { "No.", "Full Name", "Address", "Class Name", "Identity Card", "Phone Number" };
		JTable jT = new JTable(data, column);
		JScrollPane sp = new JScrollPane(jT);
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.getContentPane().add(sp);
		this.setTitle("List of Students");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
