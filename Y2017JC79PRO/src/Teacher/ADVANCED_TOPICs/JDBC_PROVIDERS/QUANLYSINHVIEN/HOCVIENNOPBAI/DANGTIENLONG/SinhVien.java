package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;

public class SinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboBox;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinhVien frame = new SinhVien();
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
	public SinhVien() {
		setTitle("Them Sinh vien vao lop hoc");
		setBounds(100, 100, 784, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaHocVien = new JLabel("Ma Hoc vien");
		lblMaHocVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaHocVien.setBounds(58, 44, 132, 36);
		contentPane.add(lblMaHocVien);
		
		JLabel lblHoVaTen = new JLabel("Ho va Ten");
		lblHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoVaTen.setBounds(58, 99, 132, 36);
		contentPane.add(lblHoVaTen);
		
		JLabel lblDienThoai = new JLabel("Dien thoai");
		lblDienThoai.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDienThoai.setBounds(58, 148, 132, 36);
		contentPane.add(lblDienThoai);
		
		JLabel lblDiaChi = new JLabel("Dia chi");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDiaChi.setBounds(58, 197, 132, 36);
		contentPane.add(lblDiaChi);
		
		JLabel lblMaLop = new JLabel("Ma lop");
		lblMaLop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaLop.setBounds(58, 253, 132, 36);
		contentPane.add(lblMaLop);
		
		textField = new JTextField();
		textField.setBounds(202, 46, 437, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 101, 437, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 150, 437, 36);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 199, 437, 36);
		contentPane.add(textField_3);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setForeground(Color.LIGHT_GRAY);
		comboBox.setBounds(202, 255, 437, 36);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("Them Sinh vien");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(548, 320, 178, 52);
		contentPane.add(btnNewButton);
	}
}
