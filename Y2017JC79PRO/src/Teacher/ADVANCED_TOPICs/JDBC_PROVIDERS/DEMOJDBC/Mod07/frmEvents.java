package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMOJDBC.Mod07;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class frmEvents extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEvents frame = new frmEvents();
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
	public frmEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. Khai báo khởi tạo đối tượng
		        Connection objConnection;
		        
		        // 2. Khai báo & khởi tạo đối tượng trong thư viện sqljdbc4.0.jar
		        SQLServerDataSource objDts = new SQLServerDataSource();          
		        
		        // 3. Thiết lập tham số cấu hình hệ thống        
		        objDts.setServerName("127.0.0.1");
		        objDts.setUser("sa");
		        objDts.setPassword("nothing");
		        objDts.setDatabaseName("TICKETBOX_DB");
		        objDts.setPortNumber(1433);

				// 3. Kiểm tra trạng thái kết nối tới CSDL
				try {
					objConnection = objDts.getConnection();
					if (!objConnection.isClosed()) {
						// 4. Khởi tạo CallableStatement thông qua Connections
		                CallableStatement objCmst;
		                ResultSet objRs;
		                //String sSQL = "Select EventName, Price, EventDay From Events";
		                objCmst = objConnection.prepareCall("{call SP_DANHSACHSUKIENDEMOCOTHAMSO(?,?)}");
		                objCmst.setInt("EVENTMONTH", 6);
		                objCmst.setInt("EVENTDAY", 11);
		                
						// 5. Ủy quyền thực thi truy vấn & nhận về tập bản ghi --> ResultSet
		                objRs = objCmst.executeQuery();

						// 6. Duyệt & hiển thị ra bên ngoài
		                Controls objControl = new Controls();
		                jtbLoadData.setModel(objControl.getModels(objRs));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}			
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 791, 389);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
	}
}
