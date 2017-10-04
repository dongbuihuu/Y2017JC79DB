package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO28042017.MOD05;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import SQLLibrary.SQLConnects;
import SQLLibrary.SQLParams;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JDateChooser;

public class frmComboBox extends JFrame {

	private JPanel contentPane;
	private JTextField txtRollNo;
	private JTextField txtFullName;
	private JTextField txtMark;
	private JComboBox cboStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmComboBox frame = new frmComboBox();
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
	public frmComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cboStudent = new JComboBox();
		cboStudent.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange() == 1){
					Student objStudent = (Student) arg0.getItem();
					txtRollNo.setText(""+objStudent.getRollNo());
					txtFullName.setText(objStudent.getFullName());
					txtMark.setText(""+objStudent.getMark());
				}					
			}
		});
		cboStudent.setBounds(20, 27, 381, 37);
		contentPane.add(cboStudent);

		txtRollNo = new JTextField();
		txtRollNo.setBounds(20, 87, 381, 28);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);

		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		txtFullName.setBounds(20, 130, 381, 28);
		contentPane.add(txtFullName);

		txtMark = new JTextField();
		txtMark.setColumns(10);
		txtMark.setBounds(20, 169, 381, 28);
		contentPane.add(txtMark);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(20, 208, 381, 28);
		contentPane.add(dateChooser);

		ThucThiNghiepVu();
	}

	void ThucThiNghiepVu() {
		// 1. Khai báo đối tượng
		SQLParams objParam = new SQLParams();
		objParam.setsServerName("192.168.0.220");
		objParam.setsUserName("y2017cs05");
		objParam.setsPassWord("nothing");
		objParam.setsDatabaseName("TICKETBOX_DB");
		objParam.setiPortNumber(1433);

		SQLConnects objConnect = new SQLConnects();
		try {
			Connection objConnection = objConnect.OpenConnection(objParam);

			// 2.
			try {
				if (!objConnection.isClosed()) {
					ResultSet objRs = null;
					// Statement objSt = null;
					CallableStatement objCmst = null;

					// 3. Khởi tạo thông tin Statement
					objCmst = objConnection.prepareCall("{call SP_DANHSACHHOCSINH()}");
					
					// 4. Ủy quyền thực thi và nhận về Resultset
					objRs = objCmst.executeQuery();

					//5. Duyệt tập bản ghi
					while(objRs.next()){
						Student objStudent = new Student();
						objStudent.setRollNo(objRs.getInt("RollNo"));
						objStudent.setFullName(objRs.getString("FullName"));
						objStudent.setMark(objRs.getFloat("Mark"));
						cboStudent.addItem(objStudent);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
