package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMOJDBC.Mod07.Controls;
import JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module03.EventEntity;
import SQLLibs.ConnectEntity;
import SQLLibs.LibSQLConections;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;

public class frmEventAdd extends JFrame {

	private JPanel contentPane;
	private JTable jtbLoadData;
	private JButton button;
	private DefaultTableModel mDtmModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEventAdd frame = new frmEventAdd();
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
	public frmEventAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
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
							
							objCmst = objConnection.prepareCall("{call SP_INSERT_UPDATE_EVENT(?,?,?,?,?)}");
							objCmst.setByte("Flag", (byte)1);							
							objCmst.setString("EventId", "64EC3850-0453-4E77-A5AE-70E49C617575");
							objCmst.setString("EventName", "CHƯƠNG TRÌNH DÀNH CHO SINH VIÊN CÔNG NGHỆ");
							objCmst.setString("Price", "0 VNĐ");
							objCmst.setInt("EventDay", 20);							
							objCmst.execute();
							
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
								mDtmModel = new DefaultTableModel();
								mDtmModel = objControl.getDataModels(lisEvent);
								jtbLoadData.setModel(mDtmModel);
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
		btnNewButton.setBounds(0, 0, 178, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 34, 745, 345);
		contentPane.add(scrollPane);
		
		jtbLoadData = new JTable();
		scrollPane.setViewportView(jtbLoadData);
		
		button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sEventId = (String) mDtmModel.getValueAt(
									jtbLoadData.getSelectedRow(), 0);
				JOptionPane.showMessageDialog(getParent(), "EventId = "+ sEventId);					
			}
		});
		button.setBounds(194, 0, 178, 23);
		contentPane.add(button);
	}

}
