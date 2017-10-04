package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain frame = new frmMain();
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
	public frmMain() {
		setTitle("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnShowStudent = new JButton("Xem danh sách sinh viên của từng lớp học");
		btnShowStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmJTableViewStudent frmTableView = new frmJTableViewStudent();
				frmTableView.setVisible(true);
			}
		});
		btnShowStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnShowStudent.setBounds(117, 34, 305, 36);
		contentPane.add(btnShowStudent);
		
		JButton btnThemLH = new JButton("Thêm thông tin lớp học");
		btnThemLH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThemLH.setBounds(117, 93, 305, 36);
		contentPane.add(btnThemLH);
		
		JButton btnThemSV = new JButton("Thêm thông tin sinh viên");
		btnThemSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudent frmAddS = new frmAddStudent();
				frmAddS.setVisible(true);
			}
		});
		btnThemSV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThemSV.setBounds(117, 151, 305, 36);
		contentPane.add(btnThemSV);
		
		JButton btnThoat = new JButton("Thoát ứng dụng");
		btnThoat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThoat.setBounds(117, 209, 305, 36);
		contentPane.add(btnThoat);
	}
}
