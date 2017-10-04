package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH.Controllers;
//import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH.IMICSQLServerManager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GiaoDien extends JFrame {

	LopHoc frmLopHoc = new LopHoc();
	SinhVien frmSinhVien = new SinhVien();
	XemDanhsach frmXemDS = new XemDanhsach();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
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
	public GiaoDien() {
		setTitle("Quan ly thong tin Truong Dai hoc A");
		setBounds(100, 100, 767, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClass = new JButton("1. Quan ly thong tin lop hoc");
		btnClass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLopHoc.setVisible(true);
			}
		});
		btnClass.setBounds(153, 46, 447, 52);
		contentPane.add(btnClass);
		
		JButton btnStudent = new JButton("2. Quan ly thong tin cac sinh vien");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSinhVien.setVisible(true);
			}
		});
		btnStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnStudent.setBounds(153, 111, 447, 52);
		contentPane.add(btnStudent);
		
		JButton btnLoadData = new JButton("3. Xem danh sach sinh vien theo lop hoc");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmXemDS.setVisible(true);
			}
		});
		btnLoadData.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLoadData.setBounds(153, 177, 447, 52);
		contentPane.add(btnLoadData);
		
		JButton btnExit = new JButton("4. Thoat ung dung");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
					int iOpt = JOptionPane.showConfirmDialog(getParent(), 
							"Bạn có chắc chắn muốn thoát?",
							"Thông báo", 
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);
					if(iOpt == 0){
						dispose();
					
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(153, 242, 447, 52);
		contentPane.add(btnExit);
	}
}
