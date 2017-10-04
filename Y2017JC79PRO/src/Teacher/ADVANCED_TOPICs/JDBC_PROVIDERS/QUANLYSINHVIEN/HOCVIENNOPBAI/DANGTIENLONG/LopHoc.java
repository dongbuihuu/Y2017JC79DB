package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONNECTIONMAN.IMICSQLServerManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class LopHoc extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaLop;
	private JTextField txtTenLop;
	private JTextField txtSoHocVien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LopHoc frame = new LopHoc();
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
	public LopHoc() {
		setTitle("Them vao danh sach Lop hoc");
		setBounds(100, 100, 740, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaLopHoc = new JLabel("Ma lop hoc");
		lblMaLopHoc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaLopHoc.setBounds(60, 66, 100, 29);
		contentPane.add(lblMaLopHoc);
		
		JLabel lblTenLop = new JLabel("Ten Lop");
		lblTenLop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTenLop.setBounds(60, 115, 100, 29);
		contentPane.add(lblTenLop);
		
		JLabel lblSoHocVien = new JLabel("So Hoc vien");
		lblSoHocVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSoHocVien.setBounds(60, 170, 100, 29);
		contentPane.add(lblSoHocVien);
		
		txtMaLop = new JTextField();
		txtMaLop.setBounds(198, 61, 418, 37);
		contentPane.add(txtMaLop);
		txtMaLop.setColumns(10);
		
		txtTenLop = new JTextField();
		txtTenLop.setColumns(10);
		txtTenLop.setBounds(198, 113, 418, 37);
		contentPane.add(txtTenLop);
		
		txtSoHocVien = new JTextField();
		txtSoHocVien.setColumns(10);
		txtSoHocVien.setBounds(198, 168, 418, 37);
		contentPane.add(txtSoHocVien);
		
		JButton btnThemLopHoc = new JButton("Them Lop hoc");
		btnThemLopHoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. Khai báo và khởi tạo đối tượng
				ClassInfo objClass = new ClassInfo();
				Connection objConnection = null;
				IMICSQLServerManager obj = new IMICSQLServerManager();

				// 4. Sử dụng thuộc tính getConnection để nhận về 1 đối tượng
				// chứa đầy đủ thông tin kết nối.
				try {
					objConnection = obj.OpenConnection("TIENLONG\\SQLSERVER", "sa", "long16695", "QUANLYSV", 1433);

					// 5. Kiểm tra trạng thái kết nối(Thành công/Thất bại)?
					if (!objConnection.isClosed()) {
						
						//6. Khai báo và khởi tạo Controllers
						JController objController = new JController(objConnection);
						
						//7. Ủy quyền thực thi nghiệp vụ
						if(objController.UpdateElement(objClass)){
							JOptionPane.showMessageDialog(null, "Cập nhật thành công");
						}
						else
							JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
					}
				}catch(Exception ex){
					
				}
			}
			
		});
		btnThemLopHoc.setBounds(504, 248, 160, 44);
		contentPane.add(btnThemLopHoc);
	}
}
