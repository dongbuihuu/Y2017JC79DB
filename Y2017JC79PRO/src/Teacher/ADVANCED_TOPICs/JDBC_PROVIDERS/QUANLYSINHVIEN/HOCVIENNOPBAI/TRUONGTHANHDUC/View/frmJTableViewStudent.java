package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONNECTIONMAN.IMICSQLServerManager;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Entity.ClassObject;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Entity.StudentObject;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Controller.Controller;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class frmJTableViewStudent extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmJTableViewStudent frame = new frmJTableViewStudent();
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
	public frmJTableViewStudent() {
		setTitle("Show Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChnLp = new JLabel("Chọn lớp");
		lblChnLp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChnLp.setBounds(10, 22, 78, 14);
		contentPane.add(lblChnLp);
		
		JComboBox cboLopHoc = new JComboBox();
		cboLopHoc.setModel(new DefaultComboBoxModel(new String[] {"Y2016JC36", "Y2016CS38"}));
		cboLopHoc.setBounds(82, 20, 222, 20);
		contentPane.add(cboLopHoc);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 505, 236);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
		
		JButton btnShowData = new JButton("Show Data");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1.Khai báo đối tượng Connection
				Connection objConnection = null;
				
				//2.Khai báo đối tượng IMICSQLServerManager
				IMICSQLServerManager obj = new IMICSQLServerManager();
				
				try {
					// 3.Sử dụng thuộc tính getConnection để nhận về 1 đối tượng
					objConnection = obj.OpenConnection("192.168.56.1", "sa", "123", "HOCSINH", 1433);
					
					ClassObject objC = new ClassObject();
					objC.setMALH(cboLopHoc.getSelectedIndex());
					
					if(!objConnection.isClosed()){
						//4.Khai báo đối tượng Controller
						Controller objController = new Controller(objConnection);
						
						//5.Ủy quyền thực thi nghiệp vuj
						jtbLoadData.setModel(objController.BinddingOf());
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
		btnShowData.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnShowData.setBounds(325, 19, 114, 23);
		contentPane.add(btnShowData);
	}
}
