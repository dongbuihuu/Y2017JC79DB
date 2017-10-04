package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JC19SQLConnection.SQLConnect;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.event.ActionEvent;

public class frmStudents extends JFrame {

	private JPanel contentPane;
	private JTextField txtRollNo;
	private JTextField txtFullName;
	private JTextField txtEmail;
	private JTextField txtMobile;
	private JTextField txtMark;
	private JComboBox cboStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmStudents frame = new frmStudents();
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
	public frmStudents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnThucThi = new JButton("THỰC THI");
		btnThucThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. Kết nối tới CSDL?
				//1. Khai báo đối tượng
				Connection objConnection;
				
				//2. Khai báo & thiết lập các tham số kết nối
				JC19SQLConnection.SQLConnect objData = new SQLConnect();					
				
				//3. Thực thi mở kết nối tới csdl SQL
				try {
					objConnection = objData.OpenConnection(
								"127.0.0.1", 
								"nothing", "sa", "TICKETBOX_DB", 1433);
					if(!objConnection.isClosed()){
						//4. Khai báo các đối tượng
						ResultSet objRs;
						CallableStatement objCmst;
						
						short shOpt = (short)JOptionPane.showConfirmDialog(null,
										"Bạn có chắc chắn muốn xem dữ liệu ko?", 
											"Thông báo",
											JOptionPane.YES_NO_OPTION);
						
						if(shOpt == 0){
							//5. Khởi tạo đối tượng CallableStatement qua Connection
							objCmst = objConnection.prepareCall("{call SP_GetStudent()}");
							
							//6. Thực thi nhận về tập bản ghi --> đưa vào Resultset					
							objRs = objCmst.executeQuery();
							
							//7. Duyệt và hiển thị												
							while(objRs.next()){
									StudentEntity objStudent = new StudentEntity();
									objStudent.setiRollNo(objRs.getInt(1));
									objStudent.setsFullName(
															objRs.getString("FullName"));	
									objStudent.setsEmail(objRs.getString("Email"));
									objStudent.setsMark(
														objRs.getString("Mark"));
									cboStudent.addItem(objStudent);
							}							
						}
						else{
							JOptionPane.showMessageDialog(null, "Cảm ơn vì bạn Thúy ko muốn xem!!!");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		});
		btnThucThi.setBounds(10, 21, 89, 38);
		contentPane.add(btnThucThi);
		
		cboStudent = new JComboBox();
		cboStudent.setBounds(109, 22, 325, 37);
		contentPane.add(cboStudent);
		
		JButton btnLayThongTin = new JButton("LẤY THÔNG TIN CỦA SINH VIÊN");
		btnLayThongTin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. Lấy về 1 phần tử là Student Object
				StudentEntity objStudent = (StudentEntity)cboStudent.
																			getSelectedItem();
				txtRollNo.setText(""+objStudent.getiRollNo());
				txtFullName.setText(objStudent.getsFullName());
				txtEmail.setText(objStudent.getsEmail());
				txtMobile.setText(objStudent.getsMark());				
			}
		});
		btnLayThongTin.setBounds(208, 70, 226, 31);
		contentPane.add(btnLayThongTin);
		
		JLabel lblNewLabel = new JLabel("- RollNo : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 123, 75, 14);
		contentPane.add(lblNewLabel);
		
		txtRollNo = new JTextField();
		txtRollNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtRollNo.setBounds(78, 121, 152, 20);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		JLabel lblFullname = new JLabel("- Fullname :");
		lblFullname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFullname.setBounds(10, 150, 75, 14);
		contentPane.add(lblFullname);
		
		txtFullName = new JTextField();
		txtFullName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFullName.setColumns(10);
		txtFullName.setBounds(78, 148, 346, 20);
		contentPane.add(txtFullName);
		
		JLabel lblEmail = new JLabel("- Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(10, 177, 75, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setColumns(10);
		txtEmail.setBounds(78, 175, 346, 20);
		contentPane.add(txtEmail);
		
		JLabel lblMobile = new JLabel("- Mobile :");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMobile.setBounds(10, 204, 75, 14);
		contentPane.add(lblMobile);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMobile.setColumns(10);
		txtMobile.setBounds(78, 202, 152, 20);
		contentPane.add(txtMobile);
		
		txtMark = new JTextField();
		txtMark.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMark.setColumns(10);
		txtMark.setBounds(78, 229, 95, 20);
		contentPane.add(txtMark);
		
		JLabel lblMark = new JLabel("- Mark :");
		lblMark.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMark.setBounds(10, 231, 75, 14);
		contentPane.add(lblMark);
	}
}
