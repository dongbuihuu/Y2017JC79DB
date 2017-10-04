package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.DEMO.BAITOANXML;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.DEMO.BAITOANXML.IOFIles.Controls;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class frmXMLDemo extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaSinhVien;
	private JTextField txtHovaTen;
	private JTextField txtEmail;
	private List<SinhVien> mlisSinhVien;
	private JLabel lblInfo;
	private JTable jtbLoadData;
	private JScrollPane scrollPane;
	private JButton btnGhiDLiu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmXMLDemo frame = new frmXMLDemo();
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
	public frmXMLDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("- Vui lòng nhập đầy đủ thông tin:");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel.setBounds(21, 11, 420, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMSinh = new JLabel("- Mã Sinh Viên :");
		lblMSinh.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblMSinh.setBounds(10, 47, 112, 14);
		contentPane.add(lblMSinh);
		
		JLabel lblHV = new JLabel("- Họ và Tên:");
		lblHV.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblHV.setBounds(24, 92, 87, 14);
		contentPane.add(lblHV);
		
		JLabel lblEmail = new JLabel("- Email :");
		lblEmail.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblEmail.setBounds(46, 137, 76, 14);
		contentPane.add(lblEmail);
		
		txtMaSinhVien = new JTextField();
		txtMaSinhVien.setBounds(105, 45, 338, 20);
		contentPane.add(txtMaSinhVien);
		txtMaSinhVien.setColumns(10);
		
		txtHovaTen = new JTextField();
		txtHovaTen.setColumns(10);
		txtHovaTen.setBounds(105, 90, 336, 20);
		contentPane.add(txtHovaTen);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(107, 135, 336, 20);
		contentPane.add(txtEmail);
		
		JButton btnThemSV = new JButton("Thêm Sinh Viên");
		btnThemSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(getParent(), ":D");
				if(txtMaSinhVien.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "Bạn cần nhập vào Mã sinh viên");
				}else if(txtHovaTen.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "Bạn cần nhập vào Họ và tên");
				}else if(txtEmail.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "Bạn cần nhập vào Email");
				}else{
					SinhVien objSV = new SinhVien();
					objSV.setMaSinhVien(Integer.parseInt(txtMaSinhVien.getText()));
					objSV.setHovaTen(txtHovaTen.getText());
					objSV.setEmail(txtEmail.getText());
					mlisSinhVien.add(objSV);
					lblInfo.setText(String.format("- Hiện có: %s Sinh viên trong danh sách!", 
											mlisSinhVien.size()));
					txtMaSinhVien.setText("");
					txtHovaTen.setText("");
					txtEmail.setText("");
					
					Controls<SinhVien> objControl = new Controls<SinhVien>();
					try {
						jtbLoadData.setModel(objControl.getDataModels(mlisSinhVien));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnThemSV.setBounds(306, 166, 135, 32);
		contentPane.add(btnThemSV);
		
		lblInfo = new JLabel("");
		lblInfo.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblInfo.setBounds(10, 209, 431, 14);
		contentPane.add(lblInfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 222, 429, 219);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
		
		btnGhiDLiu = new JButton("Ghi dữ liệu xuống XML");
		btnGhiDLiu.setBounds(105, 166, 200, 32);
		contentPane.add(btnGhiDLiu);
		
		mlisSinhVien = new ArrayList<>();
	}
}
