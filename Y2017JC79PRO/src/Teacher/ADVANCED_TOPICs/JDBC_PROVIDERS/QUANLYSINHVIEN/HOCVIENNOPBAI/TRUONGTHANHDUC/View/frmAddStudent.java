package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import CONNECTIONMAN.IMICSQLServerManager;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Controller.Controller;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Entity.StudentObject;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.List;
import java.awt.event.ActionEvent;

public class frmAddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtFullName;
	private JTextField txtAge;
	private JTextField txtEmail;
	private List<StudentObject> lisStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAddStudent frame = new frmAddStudent();
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
	public frmAddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Th\u00EAm sinh vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RollNum");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 34, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFullname = new JLabel("FullName");
		lblFullname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFullname.setBounds(10, 74, 75, 14);
		contentPane.add(lblFullname);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAge.setBounds(10, 122, 46, 14);
		contentPane.add(lblAge);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(10, 174, 46, 14);
		contentPane.add(lblEmail);
		
		txtId = new JTextField();
		txtId.setBounds(80, 32, 344, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		txtFullName.setBounds(80, 72, 344, 20);
		contentPane.add(txtFullName);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(80, 120, 344, 20);
		contentPane.add(txtAge);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(80, 168, 344, 20);
		contentPane.add(txtEmail);
		
		JButton btnThemSinhVien = new JButton("Thêm Sinh Viên");
		btnThemSinhVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1.Khai báo đối tượng Connection
				Connection objConnection = null;
				
				//2.Khai báo đối tượng IMICSQLServerManager
				IMICSQLServerManager obj = new IMICSQLServerManager();
				
				//3.Kiểm tra trạng thái của các form điều khiển
				if(txtId.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "ID không được bỏ trống");
				} else if(txtFullName.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "Họ tên không được bỏ trống");
				} else if(txtAge.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "Tuổi không được bỏ trống");
				} else if(txtEmail.getText().isEmpty()){
					JOptionPane.showMessageDialog(getParent(), "Email không được bỏ trống");
				} else {
					// 4.Khai báo và khởi tạo đối tượng
					StudentObject objSV = new StudentObject();
					
					objSV.setRollNum(Integer.parseInt(txtId.getText()));
					objSV.setFullName(txtFullName.getText());
					objSV.setAge(txtAge.getText());
					objSV.setEmail(txtEmail.getText());
					
					//5.Khai báo Controller
					try {
						Controller objController = new Controller(objConnection);
						
						//6.Ủy quyền thực thi nghiệp vụ
						objController.BinddingOfStudent(objSV);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					
				}
			}
		});
		btnThemSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThemSinhVien.setBounds(80, 216, 187, 23);
		contentPane.add(btnThemSinhVien);
	}
}
