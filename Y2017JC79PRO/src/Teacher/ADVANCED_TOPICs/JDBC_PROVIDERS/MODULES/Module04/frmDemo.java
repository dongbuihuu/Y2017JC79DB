package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module04;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMOJDBC.Mod07.Controls;
import JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module03.EventEntity;
import SQLLibs.ConnectEntity;
import SQLLibs.LibSQLConections;

import javax.swing.JComboBox;

public class frmDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDemo frame = new frmDemo();
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
	public frmDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cboData = new JComboBox();
		cboData.setBounds(10, 31, 389, 33);
		contentPane.add(cboData);
		
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
}
