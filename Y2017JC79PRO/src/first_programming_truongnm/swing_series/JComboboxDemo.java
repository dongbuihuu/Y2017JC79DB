package first_programming_truongnm.swing_series;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboboxDemo extends JFrame implements ActionListener {
	private JButton jbt1;
	private JComboBox<String> jcb;
	private DefaultComboBoxModel<String> dcm1, dcm2;

	public JComboboxDemo() {
		this.setTitle("Combobox");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);

		jbt1 = new JButton("Change");
		jbt1.setBounds(200, 200, 100, 50);
		this.add(jbt1);
		jbt1.addActionListener(this);

		jcb = new JComboBox<>();
		jcb.setBounds(200, 100, 100, 50);
		this.add(jcb);

		dcm2 = new DefaultComboBoxModel<>();
		dcm2.addElement("Trung");
		dcm2.addElement("Tung");
		dcm2.addElement("Cuong");
		dcm2.addElement("Huy");
		dcm2.addElement("Truong");
		dcm2.addElement("Tuan");
		dcm2.addElement("Tien");
		dcm2.addElement("Phu");
		jcb.setModel(dcm2);

		dcm1 = new DefaultComboBoxModel<>();
		dcm1.addElement("Thu");
		dcm1.addElement("Tram");
		dcm1.addElement("Thin");
		dcm1.addElement("Thao");
		dcm1.addElement("Tin");
		dcm1.addElement("Hoai");
		dcm1.addElement("Hau");
		dcm1.addElement("Muc");
		dcm1.addElement("Trinh");
		dcm1.addElement("Huyen");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt1) {
			jcb.setModel(dcm1);
		}
	}

	public static void main(String[] args) {
		new JComboboxDemo();
	}

}
