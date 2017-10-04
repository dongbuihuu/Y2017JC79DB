package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD06.BaseUltils.IOFIles.Controls;
import JC19SQLConnection.SQLConnect;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class frmStudentAll extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;
	private JScrollPane scrollPane;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmStudentAll frame = new frmStudentAll();
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
	public frmStudentAll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
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
							
							Controls<StudentEntity> objControl = new Controls<>();			    
						    try {
								jtbLoadData.setModel(
												objControl.getModels(objRs));
							} catch (Exception e) {
								e.printStackTrace();
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
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 32, 414, 219);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
		
		button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iRollNo =  Integer.parseInt(""+jtbLoadData.getValueAt
												(jtbLoadData.getSelectedRow(), 0));
				JOptionPane.showMessageDialog(null, "Bạn muốn xóa Sinh viên có mã số là:  "+ iRollNo);
			}
		});
		button.setBounds(109, 11, 89, 23);
		contentPane.add(button);
	}

}
