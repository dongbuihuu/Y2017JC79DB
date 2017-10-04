package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMOJDBC.Mod07.Controls;
import SQLLibs.ConnectEntity;
import SQLLibs.LibSQLConections;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class frmEvents extends JFrame {

	private JPanel contentPane;
	private final JTable jtbLoadData = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();

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
		setBounds(100, 100, 807, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHienThi = new JButton("HIỂN THỊ DANH SÁCH SỰ KIỆN");
		btnHienThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection objConnection;
				//1. Khai báo tham số
				LibSQLConections obj = new LibSQLConections();
				ConnectEntity objEntity = new ConnectEntity();
				objEntity.setsServerName("192.168.0.220");
				objEntity.setsUserName("demo");
				objEntity.setsPassWord("nothing");
				objEntity.setsDatabaseName("TICKETBOX_DB");
				objEntity.setiPortNumber(1433);
				
				//2. Thực thi mở kết nối và nhận về đối tượng kết nối
				try {
					objConnection = obj.OpenConnections(objEntity);
					
					//4. Kiểm tra trạng thái kết nối
					try {
						if(!objConnection.isClosed()){
							//5. Ủy quyền thực thi qua Procedure
							ResultSet objRs;
							CallableStatement objCmst;
							objCmst = objConnection.prepareCall("{call SP_EVENT_ALL()}");
							objRs = objCmst.executeQuery();
							
							//6. Cách 1: Truyền Resultset --> nhận về DefaultTableModle
							//Controls objControl = new Controls();
							Controls<EventEntity> objControl = new Controls<EventEntity>();
							
							//7. Cách 02: Duyệt Resultset --> List<T> --> nhận về DefaultTableModel
							List<EventEntity> lisEvent = new ArrayList<>();
							while(objRs.next()){
								EventEntity objEEntity =  new EventEntity();
								objEEntity.setEventName(""+objRs.getString("EventName"));
								objEEntity.setPrice(""+ objRs.getString("Price"));
								objEEntity.setEventDay(objRs.getInt("EventDay"));
								lisEvent.add(objEEntity);
							}
							try {
								//jtbLoadData.setModel(objControl.getModels(objRs));
								jtbLoadData.setModel(objControl.getDataModels(lisEvent));
							} catch (Exception e) {
								e.printStackTrace();
							}							
						}else{
							System.out.println("Kết nối thất bại!");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				} catch (SQLServerException e) {
					e.printStackTrace();
				}
			}
		});
		btnHienThi.setBounds(0, 0, 241, 23);
		contentPane.add(btnHienThi);
		scrollPane.setBounds(0, 27, 791, 403);
		
		contentPane.add(scrollPane);
		scrollPane.setViewportView(jtbLoadData);
	}
}
